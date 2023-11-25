package e9;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.encoders.EncodingException;
import e9.d;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProtobufDataEncoderContext.java */
/* loaded from: classes3.dex */
public final class f implements b9.d {

    /* renamed from: f  reason: collision with root package name */
    private static final Charset f14135f = Charset.forName("UTF-8");

    /* renamed from: g  reason: collision with root package name */
    private static final b9.b f14136g = b9.b.a("key").b(e9.a.b().c(1).a()).a();

    /* renamed from: h  reason: collision with root package name */
    private static final b9.b f14137h = b9.b.a(AppMeasurementSdk.ConditionalUserProperty.VALUE).b(e9.a.b().c(2).a()).a();

    /* renamed from: i  reason: collision with root package name */
    private static final b9.c<Map.Entry<Object, Object>> f14138i = new b9.c() { // from class: e9.e
        @Override // b9.c
        public final void a(Object obj, Object obj2) {
            f.v((Map.Entry) obj, (b9.d) obj2);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private OutputStream f14139a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, b9.c<?>> f14140b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<Class<?>, b9.e<?>> f14141c;

    /* renamed from: d  reason: collision with root package name */
    private final b9.c<Object> f14142d;

    /* renamed from: e  reason: collision with root package name */
    private final i f14143e = new i(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProtobufDataEncoderContext.java */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f14144a;

        static {
            int[] iArr = new int[d.a.values().length];
            f14144a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14144a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14144a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(OutputStream outputStream, Map<Class<?>, b9.c<?>> map, Map<Class<?>, b9.e<?>> map2, b9.c<Object> cVar) {
        this.f14139a = outputStream;
        this.f14140b = map;
        this.f14141c = map2;
        this.f14142d = cVar;
    }

    private static ByteBuffer o(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private <T> long p(b9.c<T> cVar, T t10) throws IOException {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f14139a;
            this.f14139a = bVar;
            try {
                cVar.a(t10, this);
                this.f14139a = outputStream;
                long b10 = bVar.b();
                bVar.close();
                return b10;
            } catch (Throwable th) {
                this.f14139a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private <T> f q(b9.c<T> cVar, b9.b bVar, T t10, boolean z10) throws IOException {
        long p10 = p(cVar, t10);
        if (z10 && p10 == 0) {
            return this;
        }
        w((u(bVar) << 3) | 2);
        x(p10);
        cVar.a(t10, this);
        return this;
    }

    private <T> f r(b9.e<T> eVar, b9.b bVar, T t10, boolean z10) throws IOException {
        this.f14143e.c(bVar, z10);
        eVar.a(t10, this.f14143e);
        return this;
    }

    private static d t(b9.b bVar) {
        d dVar = (d) bVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private static int u(b9.b bVar) {
        d dVar = (d) bVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v(Map.Entry entry, b9.d dVar) throws IOException {
        dVar.a(f14136g, entry.getKey());
        dVar.a(f14137h, entry.getValue());
    }

    private void w(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f14139a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f14139a.write(i10 & 127);
    }

    private void x(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f14139a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f14139a.write(((int) j10) & 127);
    }

    @Override // b9.d
    public b9.d a(b9.b bVar, Object obj) throws IOException {
        return h(bVar, obj, true);
    }

    b9.d d(b9.b bVar, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        w((u(bVar) << 3) | 1);
        this.f14139a.write(o(8).putDouble(d10).array());
        return this;
    }

    b9.d g(b9.b bVar, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        w((u(bVar) << 3) | 5);
        this.f14139a.write(o(4).putFloat(f10).array());
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b9.d h(b9.b bVar, Object obj, boolean z10) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            w((u(bVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f14135f);
            w(bytes.length);
            this.f14139a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                h(bVar, it.next(), false);
            }
            return this;
        } else if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                q(f14138i, bVar, (Map.Entry) it2.next(), false);
            }
            return this;
        } else if (obj instanceof Double) {
            return d(bVar, ((Double) obj).doubleValue(), z10);
        } else {
            if (obj instanceof Float) {
                return g(bVar, ((Float) obj).floatValue(), z10);
            }
            if (obj instanceof Number) {
                return l(bVar, ((Number) obj).longValue(), z10);
            }
            if (obj instanceof Boolean) {
                return n(bVar, ((Boolean) obj).booleanValue(), z10);
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z10 && bArr.length == 0) {
                    return this;
                }
                w((u(bVar) << 3) | 2);
                w(bArr.length);
                this.f14139a.write(bArr);
                return this;
            }
            b9.c<?> cVar = this.f14140b.get(obj.getClass());
            if (cVar != null) {
                return q(cVar, bVar, obj, z10);
            }
            b9.e<?> eVar = this.f14141c.get(obj.getClass());
            if (eVar != null) {
                return r(eVar, bVar, obj, z10);
            }
            if (obj instanceof c) {
                return c(bVar, ((c) obj).getNumber());
            }
            if (obj instanceof Enum) {
                return c(bVar, ((Enum) obj).ordinal());
            }
            return q(this.f14142d, bVar, obj, z10);
        }
    }

    @Override // b9.d
    /* renamed from: i  reason: merged with bridge method [inline-methods] */
    public f c(b9.b bVar, int i10) throws IOException {
        return j(bVar, i10, true);
    }

    f j(b9.b bVar, int i10, boolean z10) throws IOException {
        if (z10 && i10 == 0) {
            return this;
        }
        d t10 = t(bVar);
        int i11 = a.f14144a[t10.intEncoding().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    w((t10.tag() << 3) | 5);
                    this.f14139a.write(o(4).putInt(i10).array());
                }
            } else {
                w(t10.tag() << 3);
                w((i10 << 1) ^ (i10 >> 31));
            }
        } else {
            w(t10.tag() << 3);
            w(i10);
        }
        return this;
    }

    @Override // b9.d
    /* renamed from: k  reason: merged with bridge method [inline-methods] */
    public f e(b9.b bVar, long j10) throws IOException {
        return l(bVar, j10, true);
    }

    f l(b9.b bVar, long j10, boolean z10) throws IOException {
        if (z10 && j10 == 0) {
            return this;
        }
        d t10 = t(bVar);
        int i10 = a.f14144a[t10.intEncoding().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    w((t10.tag() << 3) | 1);
                    this.f14139a.write(o(8).putLong(j10).array());
                }
            } else {
                w(t10.tag() << 3);
                x((j10 >> 63) ^ (j10 << 1));
            }
        } else {
            w(t10.tag() << 3);
            x(j10);
        }
        return this;
    }

    @Override // b9.d
    /* renamed from: m  reason: merged with bridge method [inline-methods] */
    public f f(b9.b bVar, boolean z10) throws IOException {
        return n(bVar, z10, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f n(b9.b bVar, boolean z10, boolean z11) throws IOException {
        return j(bVar, z10 ? 1 : 0, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f s(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        b9.c<?> cVar = this.f14140b.get(obj.getClass());
        if (cVar != null) {
            cVar.a(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }
}
