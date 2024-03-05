package static_nested_class;

public class Facebook {
	
	private static int maxFileSize = 200;
	private boolean shortVideo;
	private int fileSize;
	
	public Facebook() {}
	
	public Facebook(boolean shortVideo, int fileSize) {
		super();
		this.shortVideo = shortVideo;
		this.fileSize = fileSize;
	}

	static class VideoUploader {
		
		public void upload(boolean shortVideo, int fileSize) {
			Facebook facebook = new Facebook(shortVideo, fileSize);
			if(facebook.shortVideo) {
				System.out.println("Your short video is uploaded");
			} else {
				if (facebook.fileSize <= maxFileSize) {
					System.out.println("Your video is uploaded");
				}
			}
		}
	}
	
	public void uploadFacebookVideo(boolean shortV, int size) {
		VideoUploader videoUploader = new VideoUploader();
		videoUploader.upload(shortV, size);
		System.out.println("Facebook video upload  : success");
		
	}
}
