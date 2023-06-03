export class ProductElements {
  static get ElementsProduct() {
    return {
      getBtnBasket: () => cy.get('[aria-label="Show the shopping cart"]'),
      getBtnSearch: () => cy.get(".mat-search_icon-search"),
      getTxtSearch: () => cy.get("#mat-input-0"),
      getBtnAddToBasket: () => cy.get('[aria-label="Add to Basket"]'),
      getLblNotification: () => cy.get(".fa-3x.warn-notification"),
      getBasketItem: () => cy.get(".mat-column-product"),
      getRemoveFromBasketButton: () => cy.get(".fa-trash-alt.fa-w-14"),
      getNoResultsFound: () => cy.get(".noResultText"),
    };
  }
}
