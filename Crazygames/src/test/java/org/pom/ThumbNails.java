package org.pom;
import java.util.List;

import org.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
public class ThumbNails extends Baseclass{
		public void verifyAllGamesImageAndTitle() {
	        // Locate all game cards using XPath
		List<WebElement> gameCards = driver.findElements(By.xpath(".//div[@class='css-1uvr28v']"));
		Assert.assertTrue(gameCards.size() > 0, "No game cards found on CrazyGames homepage!");

	        for (WebElement card : gameCards) {
	            // Locate image inside the card using XPath
	            WebElement gameImage = card.findElement(By.xpath(".//img"));
	            Assert.assertTrue(gameImage.isDisplayed(), "Game image is not displayed!");

	            // Locate title inside the card using XPath
	            WebElement gameTitle = card.findElement(By.xpath(".//div[text()='Fortzone Battle Royale']"));
	            Assert.assertTrue(gameTitle.isDisplayed(), "Game title is not displayed!");
	            String actualTitle = gameTitle.getText();
	            Assert.assertFalse(actualTitle.isEmpty(), "Game title is empty! // Print for debugging");
	            System.out.println("Verified Game: " + actualTitle);	        }
	    }

}

