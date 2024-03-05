package static_nested_class;

import static_nested_class.Facebook.VideoUploader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Facebook fb = new Facebook();
		fb.uploadFacebookVideo(false, 150);
		
		Tiktok tiktok = new Tiktok();
		tiktok.uploadTiktokVideo();
		
		VideoUploader uploader = new VideoUploader();
		uploader.upload(true, 1);
		
		static_nested_class.Tiktok.VideoUploader uploader2 = new static_nested_class.Tiktok.VideoUploader();
		uploader2.upload();
	}

}
