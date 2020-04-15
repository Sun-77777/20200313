public class Client {
    public static void main(String[] args) {
        VideoFile videoFile;
        OperatingSystemVersion os;

        os = new WindowsVersion();
        videoFile = new RMVBFile();
        os.setVideoFile(videoFile);
        os.play("RMVBFile");

        os = new LinuxVersion();
        videoFile = new WMVFile();
        os.setVideoFile(videoFile);
        os.play("WMVFile");

        os = new UnixVersion();
        videoFile = new MPEGFile();
        os.setVideoFile(videoFile);
        os.play("MPEGFile");

        os = new WindowsVersion();
        videoFile = new AVIFile();
        os.setVideoFile(videoFile);
        os.play("AVIFile");






    }
}
