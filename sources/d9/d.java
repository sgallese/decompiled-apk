package d9;

import b9.f;
import com.google.firebase.encoders.EncodingException;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: JsonDataEncoderBuilder.java */
/* loaded from: classes3.dex */
public final class d implements c9.b<d> {

    /* renamed from: e  reason: collision with root package name */
    private static final b9.c<Object> f13131e = new b9.c() { // from class: d9.a
        @Override // b9.c
        public final void a(Object obj, Object obj2) {
            d.l(obj, (b9.d) obj2);
        }
    };

    /* renamed from: f  reason: collision with root package name */
    private static final b9.e<String> f13132f = new b9.e() { // from class: d9.b
        @Override // b9.e
        public final void a(Object obj, Object obj2) {
            ((f) obj2).b((String) obj);
        }
    };

    /* renamed from: g  reason: collision with root package name */
    private static final b9.e<Boolean> f13133g = new b9.e() { // from class: d9.c
        @Override // b9.e
        public final void a(Object obj, Object obj2) {
            d.n((Boolean) obj, (f) obj2);
        }
    };

    /* renamed from: h  reason: collision with root package name */
    private static final b f13134h = new b(null);

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, b9.c<?>> f13135a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, b9.e<?>> f13136b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private b9.c<Object> f13137c = f13131e;

    /* renamed from: d  reason: collision with root package name */
    private boolean f13138d = false;

    /* compiled from: JsonDataEncoderBuilder.java */
    /* loaded from: classes3.dex */
    class a implements b9.a {
        a() {
        }

        @Override // b9.a
        public void a(Object obj, Writer writer) throws IOException {
            e eVar = new e(writer, d.this.f13135a, d.this.f13136b, d.this.f13137c, d.this.f13138d);
            eVar.i(obj, false);
            eVar.r();
        }

        @Override // b9.a
        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* compiled from: JsonDataEncoderBuilder.java */
    /* loaded from: classes3.dex */
    private static final class b implements b9.e<Date> {

        /* renamed from: a  reason: collision with root package name */
        private static final DateFormat f13140a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f13140a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // b9.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(Date date, f fVar) throws IOException {
            fVar.b(f13140a.format(date));
        }
    }

    public d() {
        p(String.class, f13132f);
        p(Boolean.class, f13133g);
        p(Date.class, f13134h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(Object obj, b9.d dVar) throws IOException {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(Boolean bool, f fVar) throws IOException {
        fVar.d(bool.booleanValue());
    }

    public b9.a i() {
        return new a();
    }

    public d j(c9.a aVar) {
        aVar.a(this);
        return this;
    }

    public d k(boolean z10) {
        this.f13138d = z10;
        return this;
    }

    @Override // c9.b
    /* renamed from: o  reason: merged with bridge method [inline-methods] */
    public <T> d a(Class<T> cls, b9.c<? super T> cVar) {
        this.f13135a.put(cls, cVar);
        this.f13136b.remove(cls);
        return this;
    }

    public <T> d p(Class<T> cls, b9.e<? super T> eVar) {
        this.f13136b.put(cls, eVar);
        this.f13135a.remove(cls);
        return this;
    }
}
