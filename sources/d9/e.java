package d9;

import android.util.Base64;
import android.util.JsonWriter;
import b9.f;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* compiled from: JsonValueObjectEncoderContext.java */
/* loaded from: classes3.dex */
final class e implements b9.d, f {

    /* renamed from: a  reason: collision with root package name */
    private e f13141a = null;

    /* renamed from: b  reason: collision with root package name */
    private boolean f13142b = true;

    /* renamed from: c  reason: collision with root package name */
    private final JsonWriter f13143c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<?>, b9.c<?>> f13144d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<Class<?>, b9.e<?>> f13145e;

    /* renamed from: f  reason: collision with root package name */
    private final b9.c<Object> f13146f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f13147g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Writer writer, Map<Class<?>, b9.c<?>> map, Map<Class<?>, b9.e<?>> map2, b9.c<Object> cVar, boolean z10) {
        this.f13143c = new JsonWriter(writer);
        this.f13144d = map;
        this.f13145e = map2;
        this.f13146f = cVar;
        this.f13147g = z10;
    }

    private boolean q(Object obj) {
        if (obj != null && !obj.getClass().isArray() && !(obj instanceof Collection) && !(obj instanceof Date) && !(obj instanceof Enum) && !(obj instanceof Number)) {
            return false;
        }
        return true;
    }

    private e t(String str, Object obj) throws IOException, EncodingException {
        v();
        this.f13143c.name(str);
        if (obj == null) {
            this.f13143c.nullValue();
            return this;
        }
        return i(obj, false);
    }

    private e u(String str, Object obj) throws IOException, EncodingException {
        if (obj == null) {
            return this;
        }
        v();
        this.f13143c.name(str);
        return i(obj, false);
    }

    private void v() throws IOException {
        if (this.f13142b) {
            e eVar = this.f13141a;
            if (eVar != null) {
                eVar.v();
                this.f13141a.f13142b = false;
                this.f13141a = null;
                this.f13143c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // b9.d
    public b9.d a(b9.b bVar, Object obj) throws IOException {
        return m(bVar.b(), obj);
    }

    @Override // b9.d
    public b9.d c(b9.b bVar, int i10) throws IOException {
        return k(bVar.b(), i10);
    }

    @Override // b9.d
    public b9.d e(b9.b bVar, long j10) throws IOException {
        return l(bVar.b(), j10);
    }

    @Override // b9.d
    public b9.d f(b9.b bVar, boolean z10) throws IOException {
        return n(bVar.b(), z10);
    }

    public e g(int i10) throws IOException {
        v();
        this.f13143c.value(i10);
        return this;
    }

    public e h(long j10) throws IOException {
        v();
        this.f13143c.value(j10);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e i(Object obj, boolean z10) throws IOException {
        Class<?> cls;
        int i10 = 0;
        if (z10 && q(obj)) {
            Object[] objArr = new Object[1];
            if (obj == null) {
                cls = null;
            } else {
                cls = obj.getClass();
            }
            objArr[0] = cls;
            throw new EncodingException(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f13143c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f13143c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return p((byte[]) obj);
            }
            this.f13143c.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i10 < length) {
                    this.f13143c.value(r6[i10]);
                    i10++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i10 < length2) {
                    h(jArr[i10]);
                    i10++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i10 < length3) {
                    this.f13143c.value(dArr[i10]);
                    i10++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i10 < length4) {
                    this.f13143c.value(zArr[i10]);
                    i10++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    i(number, false);
                }
            } else {
                for (Object obj2 : (Object[]) obj) {
                    i(obj2, false);
                }
            }
            this.f13143c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f13143c.beginArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                i(it.next(), false);
            }
            this.f13143c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f13143c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    m((String) key, entry.getValue());
                } catch (ClassCastException e10) {
                    throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                }
            }
            this.f13143c.endObject();
            return this;
        } else {
            b9.c<?> cVar = this.f13144d.get(obj.getClass());
            if (cVar != null) {
                return s(cVar, obj, z10);
            }
            b9.e<?> eVar = this.f13145e.get(obj.getClass());
            if (eVar != null) {
                eVar.a(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                b(((Enum) obj).name());
                return this;
            } else {
                return s(this.f13146f, obj, z10);
            }
        }
    }

    @Override // b9.f
    /* renamed from: j  reason: merged with bridge method [inline-methods] */
    public e b(String str) throws IOException {
        v();
        this.f13143c.value(str);
        return this;
    }

    public e k(String str, int i10) throws IOException {
        v();
        this.f13143c.name(str);
        return g(i10);
    }

    public e l(String str, long j10) throws IOException {
        v();
        this.f13143c.name(str);
        return h(j10);
    }

    public e m(String str, Object obj) throws IOException {
        if (this.f13147g) {
            return u(str, obj);
        }
        return t(str, obj);
    }

    public e n(String str, boolean z10) throws IOException {
        v();
        this.f13143c.name(str);
        return d(z10);
    }

    @Override // b9.f
    /* renamed from: o  reason: merged with bridge method [inline-methods] */
    public e d(boolean z10) throws IOException {
        v();
        this.f13143c.value(z10);
        return this;
    }

    public e p(byte[] bArr) throws IOException {
        v();
        if (bArr == null) {
            this.f13143c.nullValue();
        } else {
            this.f13143c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() throws IOException {
        v();
        this.f13143c.flush();
    }

    e s(b9.c<Object> cVar, Object obj, boolean z10) throws IOException {
        if (!z10) {
            this.f13143c.beginObject();
        }
        cVar.a(obj, this);
        if (!z10) {
            this.f13143c.endObject();
        }
        return this;
    }
}
