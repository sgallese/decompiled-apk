package coil.memory;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import b5.p;
import c5.c;
import c5.i;
import coil.memory.MemoryCache;
import ec.n0;
import g5.k;
import g5.u;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import qc.q;
import vc.l;
import x4.a;
import x4.b;

/* compiled from: MemoryCacheService.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static final a f9032c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final q4.g f9033a;

    /* renamed from: b  reason: collision with root package name */
    private final p f9034b;

    /* compiled from: MemoryCacheService.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    public c(q4.g gVar, p pVar, u uVar) {
        this.f9033a = gVar;
        this.f9034b = pVar;
    }

    private final String b(MemoryCache.b bVar) {
        Object obj = bVar.b().get("coil#disk_cache_key");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    private final boolean d(MemoryCache.b bVar) {
        Boolean bool;
        Object obj = bVar.b().get("coil#is_sampled");
        if (obj instanceof Boolean) {
            bool = (Boolean) obj;
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final boolean e(b5.h hVar, MemoryCache.Key key, MemoryCache.b bVar, i iVar, c5.h hVar2) {
        int i10;
        boolean z10;
        double f10;
        boolean d10 = d(bVar);
        if (c5.b.a(iVar)) {
            if (d10) {
                return false;
            }
            return true;
        }
        String str = key.c().get("coil#transformation_size");
        if (str != null) {
            return q.d(str, iVar.toString());
        }
        int width = bVar.a().getWidth();
        int height = bVar.a().getHeight();
        c5.c b10 = iVar.b();
        int i11 = Integer.MAX_VALUE;
        if (b10 instanceof c.a) {
            i10 = ((c.a) b10).f8840a;
        } else {
            i10 = Integer.MAX_VALUE;
        }
        c5.c a10 = iVar.a();
        if (a10 instanceof c.a) {
            i11 = ((c.a) a10).f8840a;
        }
        double c10 = t4.h.c(width, height, i10, i11, hVar2);
        boolean a11 = k.a(hVar);
        if (a11) {
            f10 = l.f(c10, 1.0d);
            if (Math.abs(i10 - (width * f10)) <= 1.0d || Math.abs(i11 - (f10 * height)) <= 1.0d) {
                return true;
            }
        } else if ((g5.l.s(i10) || Math.abs(i10 - width) <= 1) && (g5.l.s(i11) || Math.abs(i11 - height) <= 1)) {
            return true;
        }
        if (c10 == 1.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && !a11) {
            return false;
        }
        if (c10 > 1.0d && d10) {
            return false;
        }
        return true;
    }

    public final MemoryCache.b a(b5.h hVar, MemoryCache.Key key, i iVar, c5.h hVar2) {
        MemoryCache.b bVar;
        if (!hVar.C().getReadEnabled()) {
            return null;
        }
        MemoryCache d10 = this.f9033a.d();
        if (d10 != null) {
            bVar = d10.a(key);
        } else {
            bVar = null;
        }
        if (bVar == null || !c(hVar, key, bVar, iVar, hVar2)) {
            return null;
        }
        return bVar;
    }

    public final boolean c(b5.h hVar, MemoryCache.Key key, MemoryCache.b bVar, i iVar, c5.h hVar2) {
        if (!this.f9034b.c(hVar, g5.a.c(bVar.a()))) {
            return false;
        }
        return e(hVar, key, bVar, iVar, hVar2);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.Map, qc.h] */
    public final MemoryCache.Key f(b5.h hVar, Object obj, b5.l lVar, q4.d dVar) {
        Map t10;
        MemoryCache.Key B = hVar.B();
        if (B != null) {
            return B;
        }
        dVar.j(hVar, obj);
        String f10 = this.f9033a.getComponents().f(obj, lVar);
        dVar.e(hVar, f10);
        ?? r92 = 0;
        if (f10 == null) {
            return null;
        }
        List<e5.c> O = hVar.O();
        Map<String, String> e10 = hVar.E().e();
        if (!O.isEmpty() || !e10.isEmpty()) {
            t10 = n0.t(e10);
            if ((!O.isEmpty()) != false) {
                List<e5.c> O2 = hVar.O();
                int size = O2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    t10.put("coil#transformation_" + i10, O2.get(i10).a());
                }
                t10.put("coil#transformation_size", lVar.o().toString());
            }
            return new MemoryCache.Key(f10, t10);
        }
        return new MemoryCache.Key(f10, r92, 2, r92);
    }

    public final b5.q g(b.a aVar, b5.h hVar, MemoryCache.Key key, MemoryCache.b bVar) {
        return new b5.q(new BitmapDrawable(hVar.l().getResources(), bVar.a()), hVar, t4.f.MEMORY_CACHE, key, b(bVar), d(bVar), g5.l.t(aVar));
    }

    public final boolean h(MemoryCache.Key key, b5.h hVar, a.b bVar) {
        MemoryCache d10;
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        if (hVar.C().getWriteEnabled() && (d10 = this.f9033a.d()) != null && key != null) {
            Drawable e10 = bVar.e();
            if (e10 instanceof BitmapDrawable) {
                bitmapDrawable = (BitmapDrawable) e10;
            } else {
                bitmapDrawable = null;
            }
            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("coil#is_sampled", Boolean.valueOf(bVar.f()));
                String d11 = bVar.d();
                if (d11 != null) {
                    linkedHashMap.put("coil#disk_cache_key", d11);
                }
                d10.c(key, new MemoryCache.b(bitmap, linkedHashMap));
                return true;
            }
        }
        return false;
    }
}
