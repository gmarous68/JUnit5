package craighawkins.section6;

public class ColoredRectangle {
	
	int height;
	int width;
	Pixel[][] pixels;
	
	ColoredRectangle(int height, int width) {
		this.height = height;
		this.width = width;
		pixels = initialize(height, width);
	}
	
	private Pixel[][] initialize(int height, int width) {
		Pixel[][] result = new Pixel[height][width];
		for (int row = 0; row < height; row++) {
			for (int col = 0; col < width; col++) {
				result[row][col] = new Pixel(1, 1, 1);
			}
		}
		
		return result;
	}
	
	//dims the brightness of the colors
	public void dim(float amount) {
		for (int row = 0; row < height; row++) {
			for (int col = 0; col < width; col++) {
				Pixel pixel = pixels[row][col];
				pixel.red -= amount;
				pixel.green -= amount;
				pixel.blue -= amount;
			}
		}
	}
}

class Pixel {
	//0.0 means zero intensity, 1.0 means full intensity
	float red;
	float green;
	float blue;
	
	public Pixel(float red, float green, float blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
}












