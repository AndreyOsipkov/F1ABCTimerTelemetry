package horrorsoft.com.f1abctimertelemetry.bluetooth;

/**
 * Created by Alexey on 15.12.2015.
 *
 */
public interface IUploadStatusListener {
    void error(String errorMessage);
    void uploadProgress(int current, int total);
    void finishUpload();
}
