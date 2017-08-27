import { browser, element, by } from 'protractor';

export class TestingCommandOptionsPage {
  navigateTo() {
    return browser.get('/');
  }

  getParagraphText() {
    return element(by.css('al-root h1')).getText();
  }
}
