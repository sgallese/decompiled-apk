package retrofit2.converter.gson;

import com.google.gson.f;
import com.google.gson.s;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.c;
import retrofit2.Converter;

/* loaded from: classes4.dex */
final class GsonRequestBodyConverter<T> implements Converter<T, RequestBody> {
    private static final MediaType MEDIA_TYPE = MediaType.get("application/json; charset=UTF-8");
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final s<T> adapter;
    private final f gson;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GsonRequestBodyConverter(f fVar, s<T> sVar) {
        this.gson = fVar;
        this.adapter = sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // retrofit2.Converter
    public /* bridge */ /* synthetic */ RequestBody convert(Object obj) throws IOException {
        return convert((GsonRequestBodyConverter<T>) obj);
    }

    @Override // retrofit2.Converter
    public RequestBody convert(T t10) throws IOException {
        c cVar = new c();
        ja.c p10 = this.gson.p(new OutputStreamWriter(cVar.V(), UTF_8));
        this.adapter.write(p10, t10);
        p10.close();
        return RequestBody.create(MEDIA_TYPE, cVar.j0());
    }
}
