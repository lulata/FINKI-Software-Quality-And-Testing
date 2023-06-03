import { ProductElements } from "./products.elements";

export class ProductMethods {
  addItemToBasket(item: string) {
    ProductElements.ElementsProduct.getBtnSearch().click();
    ProductElements.ElementsProduct.getTxtSearch().type(item);
    ProductElements.ElementsProduct.getTxtSearch().type("{enter}");
    ProductElements.ElementsProduct.getBtnAddToBasket().click();
  }
  verifyItemAddedToBasket(numAdded: string) {
    ProductElements.ElementsProduct.getLblNotification().should("have.text", numAdded);
  }
  goToBasket() {
    ProductElements.ElementsProduct.getLblNotification().click();
  }
  verifyItemInBasket(item: string) {
    ProductElements.ElementsProduct.getBasketItem().should("contain.text", item);
  }
  removeItemFromBasket() {
    ProductElements.ElementsProduct.getRemoveFromBasketButton().click();
  }
  checkIfNotExistingItemCanBeAdded(item: string) {
    ProductElements.ElementsProduct.getBtnSearch().click();
    ProductElements.ElementsProduct.getTxtSearch().type(item);
    ProductElements.ElementsProduct.getTxtSearch().type("{enter}");
    // ProductElements.ElementsProduct.getBtnAddToBasket().should("be.disabled");
    ProductElements.ElementsProduct.getBtnAddToBasket().should("not.exist");
    ProductElements.ElementsProduct.getNoResultsFound().should("be.visible");
  }
  verifyItemNotBasket(item: string) {
    ProductElements.ElementsProduct.getBasketItem().should("not.contain.text", item);
  }
}
