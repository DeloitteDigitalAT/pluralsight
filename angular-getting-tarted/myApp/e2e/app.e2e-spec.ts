import { TestingCommandOptionsPage } from './app.po';

describe('testing-command-options App', () => {
  let page: TestingCommandOptionsPage;

  beforeEach(() => {
    page = new TestingCommandOptionsPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('al works!');
  });
});
