package mojang.paulscode.sound.codecs;

import java.io.IOException;
import java.io.InputStream;

import mojang.SoundStream;
import mojang.paulscode.sound.codecs.CodecJOrbis;

public class CodecMus extends CodecJOrbis {

   protected InputStream openInputStream() throws IOException {
      return new SoundStream(this, this.url, this.urlConnection.getInputStream());
   }
}
