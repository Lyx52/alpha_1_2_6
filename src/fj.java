import java.io.InputStream;
import paulscode.sound.codecs.CodecJOrbis;

public class fj extends CodecJOrbis {

   protected InputStream openInputStream() {
      return new in(this, this.url, this.urlConnection.getInputStream());
   }
}
