package e9;

import com.google.firebase.encoders.EncodingException;
import e9.h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ProtobufEncoder.java */
/* loaded from: classes3.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, b9.c<?>> f14145a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, b9.e<?>> f14146b;

    /* renamed from: c  reason: collision with root package name */
    private final b9.c<Object> f14147c;

    /* compiled from: ProtobufEncoder.java */
    /* loaded from: classes3.dex */
    public static final class a implements c9.b<a> {

        /* renamed from: d  reason: collision with root package name */
        private static final b9.c<Object> f14148d = new b9.c() { // from class: e9.g
            @Override // b9.c
            public final void a(Object obj, Object obj2) {
                h.a.e(obj, (b9.d) obj2);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private final Map<Class<?>, b9.c<?>> f14149a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private final Map<Class<?>, b9.e<?>> f14150b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        private b9.c<Object> f14151c = f14148d;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(Object obj, b9.d dVar) throws IOException {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f14149a), new HashMap(this.f14150b), this.f14151c);
        }

        public a d(c9.a aVar) {
            aVar.a(this);
            return this;
        }

        @Override // c9.b
        /* renamed from: f  reason: merged with bridge method [inline-methods] */
        public <U> a a(Class<U> cls, b9.c<? super U> cVar) {
            this.f14149a.put(cls, cVar);
            this.f14150b.remove(cls);
            return this;
        }
    }

    h(Map<Class<?>, b9.c<?>> map, Map<Class<?>, b9.e<?>> map2, b9.c<Object> cVar) {
        this.f14145a = map;
        this.f14146b = map2;
        this.f14147c = cVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) throws IOException {
        new f(outputStream, this.f14145a, this.f14146b, this.f14147c).s(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
