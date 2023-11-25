package retrofit2.converter.gson;

import com.google.gson.JsonIOException;
import com.google.gson.f;
import com.google.gson.s;
import ja.a;
import ja.b;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* loaded from: classes4.dex */
final class GsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private final s<T> adapter;
    private final f gson;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GsonResponseBodyConverter(f fVar, s<T> sVar) {
        this.gson = fVar;
        this.adapter = sVar;
    }

    @Override // retrofit2.Converter
    public T convert(ResponseBody responseBody) throws IOException {
        a o10 = this.gson.o(responseBody.charStream());
        try {
            T read = this.adapter.read(o10);
            if (o10.l0() == b.END_DOCUMENT) {
                return read;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}
