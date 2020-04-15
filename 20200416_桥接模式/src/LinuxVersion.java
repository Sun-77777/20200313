public class LinuxVersion extends OperatingSystemVersion {
    @Override
    public void play(String fileName) {
        String osType = "Linux";
        this.vf.decode(osType,fileName);
    }
}
