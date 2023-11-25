package retrofit2.converter.gson;

import com.google.gson.f;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public final class GsonConverterFactory extends Converter.Factory {
    private final f gson;

    private GsonConverterFactory(f fVar) {
        this.gson = fVar;
    }

    public static GsonConverterFactory create() {
        return create(new f());
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        return new GsonRequestBodyConverter(this.gson, this.gson.k(TypeToken.get(type)));
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        return new GsonResponseBodyConverter(this.gson, this.gson.k(TypeToken.get(type)));
    }

    public static GsonConverterFactory create(f fVar) {
        if (fVar != null) {
            return new GsonConverterFactory(fVar);
        }
        throw new NullPointerException("gson == null");
    }
}
