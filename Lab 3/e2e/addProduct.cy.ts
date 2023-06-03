import { LoginMethods } from "cypress/pageObjects/login/login.methods";
import { ProductMethods } from "cypress/pageObjects/products/products.methods";

describe("add product to basket", () => {
  var login = new LoginMethods();
  var products = new ProductMethods();

  beforeEach("Log in user", () => {
    login.navigateToLoginAndCloseDialog("http://localhost:3000/login#/login");
    login.login("david.atanasoski@students.finki.ukim.mk", "finki123");
    login.verifySuccessfullLogin();
  });

  it("Add and delete product from basket", () => {
    products.addItemToBasket("Apple Juice");
    products.verifyItemAddedToBasket("1");

    products.goToBasket();
    products.verifyItemInBasket("Apple Juice");
    products.removeItemFromBasket();
  });

  it("Search for a product that does not exist and validate that it cannot be added", () => {
    products.checkIfNotExistingItemCanBeAdded("Empty item");

    products.goToBasket();
    cy.get(".fa-3x.warn-notification").should("have.text", "0");

    products.verifyItemNotBasket("Empty item");
  });
});
