/*
  ImageApp: 
 */

public class ImageApp
{
  public static void main(String[] args)
  {

    // use any file from the lib folder
    String pictureFile = "lib/beach.jpg";

    // Get an image, get 2d array of pixels, show a color of a pixel, and display the image
    Picture origImg = new Picture(pictureFile);
    Pixel[][] origPixels = origImg.getPixels2D();
    System.out.println(origPixels[0][0].getColor());
    origImg.explore();

    // Image #1 Using the original image and pixels, recolor an image by changing the RGB color of each Pixel
    Picture recoloredImg = new Picture(pictureFile);
    Pixel[][] recoloredPixels = recoloredImg.getPixels2D();

    for (int row = 0; row < recoloredPixels.length; row++)
{
    for (int col = 0; col < recoloredPixels[0].length; col++)
    {
        int red = recoloredPixels[row][col].getRed();
        int green = recoloredPixels[row][col].getGreen();
        int blue = recoloredPixels[row][col].getBlue();

        recoloredPixels[row][col].setRed(Math.min(255, red + 70));
        recoloredPixels[row][col].setGreen(Math.min(255, green + 50));
        recoloredPixels[row][col].setBlue(Math.min(255, blue + 50));
    }
}

recoloredImg.explore();


    // Image #2 Using the original image and pixels, create a photographic negative of the image
    Picture negImg = new Picture(pictureFile);
    Pixel[][] negPixels = negImg.getPixels2D();

    for (int row = 0; row < negPixels.length; row++)
{
    for (int col = 0; col < negPixels[0].length; col++)
    {
        int red = negPixels[row][col].getRed();
        int green = negPixels[row][col].getGreen();
        int blue = negPixels[row][col].getBlue();

        negPixels[row][col].setRed(255 - red);
        negPixels[row][col].setGreen(255 - green);
        negPixels[row][col].setBlue(255 - blue);
    }
}

negImg.explore();

    // Image #3 Using the original image and pixels, create a grayscale version of the image
    Picture grayscaleImg = new Picture(pictureFile);
    Pixel[][] grayscalePixels = grayscaleImg.getPixels2D();

    for (int row = 0; row < grayscalePixels.length; row++)
{
    for (int col = 0; col < grayscalePixels[0].length; col++)
    {
        int red = grayscalePixels[row][col].getRed();
        int green = grayscalePixels[row][col].getGreen();
        int blue = grayscalePixels[row][col].getBlue();

        int average = (red + green + blue)/3;

        grayscalePixels[row][col].setRed(average);
        grayscalePixels[row][col].setGreen(average);
        grayscalePixels[row][col].setBlue(average);
    }
}

grayscaleImg.explore();

    // Image #4 Using the original image and pixels, rotate it 180 degrees
    Picture upsidedownImage = new Picture(pictureFile);
    Pixel[][] upsideDownPixels = upsidedownImage.getPixels2D();

    for (int row = 0; row < upsideDownPixels.length; row++)
{
    for (int col = 0; col < upsideDownPixels[0].length; col++)
    {
        int newRow = upsideDownPixels.length - 1 - row;
        int newCol = upsideDownPixels[0].length - 1 - col;

        upsideDownPixels[row][col]
            .setColor(origPixels[newRow][newCol].getColor());
    }
}

upsidedownImage.explore();


    // Image #5 Using the original image and pixels, rotate image 90
    Picture rotateImg = new Picture(origPixels[0].length, origPixels.length);
Pixel[][] rotatePixels = rotateImg.getPixels2D();

for (int row = 0; row < origPixels.length; row++)
{
    for (int col = 0; col < origPixels[0].length; col++)
    {
        int newRow = col;
        int newCol = origPixels.length - 1 - row;

        rotatePixels[newRow][newCol]
            .setColor(origPixels[row][col].getColor());
    }
}

rotateImg.explore();

    // Image #6 Using the original image and pixels, rotate image -90
    Picture rotateImg2 = new Picture(origPixels[0].length, origPixels.length);
Pixel[][] rotatePixels2 = rotateImg2.getPixels2D();

for (int row = 0; row < origPixels.length; row++)
{
    for (int col = 0; col < origPixels[0].length; col++)
    {
        int newRow = origPixels[0].length - 1 - col;
        int newCol = row;

        rotatePixels2[newRow][newCol]
            .setColor(origPixels[row][col].getColor());
    }
}

rotateImg2.explore();


    // Final Image: Add a small image to a larger one
    Picture largePicture =  new Picture(pictureFile);
    Pixel[][] largePixels = largePicture.getPixels2D();

    Picture smallPicture = new Picture("lib2/cat.png"); 
    Pixel[][] smallPixels = smallPicture.getPixels2D();

    int RowOffSet = 100;
    int ColumnOffSet = 100;
     
    for (int row = 0; row < smallPixels.length; row++)
{
    for (int col = 0; col < smallPixels[0].length; col++)
  {
        int red = smallPixels[row][col].getRed();
        int green = smallPixels[row][col].getGreen();
        int blue = smallPixels[row][col].getBlue();

        if (!(red > 250 && green > 250 && blue > 250))
        {
            int largeRow = row + RowOffSet;
            int largeCol = col + ColumnOffSet;

            if (largeRow < largePixels.length &&
                largeCol < largePixels[0].length)
            {
                largePixels[largeRow][largeCol].setRed(red);
                largePixels[largeRow][largeCol].setGreen(green);
                largePixels[largeRow][largeCol].setBlue(blue);
            }
        }
    }
}

largePicture.explore();

    // PSEUDOCODE: 
    // In the Image App Class add largePicture and smallPicture
    // Intialize an integer for the row and column that the smaller image would be placed on
    // Calculate RGB values of smallPicture
    // If it is not white copy the RGB values to the largePicture
    // Show both images


    // for testing  2D algorithms
    int[][] test1 = { { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 } };
    int[][] test2 = new int[4][4];


  }
}
