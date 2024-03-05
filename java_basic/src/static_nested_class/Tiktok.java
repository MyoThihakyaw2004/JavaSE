package static_nested_class;

public class Tiktok {

	public static class VideoUploader {
		
		public void upload() {
			System.out.println("Your video is uploaded");
		}
	}
	
	public void uploadTiktokVideo() {
		VideoUploader uploader = new VideoUploader();
		uploader.upload();
		System.out.println("Tiktok video upload : success");
	}
}
