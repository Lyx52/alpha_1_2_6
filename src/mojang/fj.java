package mojang;

import java.io.IOException;
import java.io.InputStream;
import mojang.paulscode.sound.codecs.CodecJOrbis;

public class fj extends CodecJOrbis {

   protected InputStream openInputStream() throws IOException {
      return new in(this, this.url, this.urlConnection.getInputStream());
   }
}
