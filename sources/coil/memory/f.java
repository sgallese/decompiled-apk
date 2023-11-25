package coil.memory;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import ec.b0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WeakMemoryCache.kt */
/* loaded from: classes.dex */
public final class f implements h {

    /* renamed from: c  reason: collision with root package name */
    public static final a f9043c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap<MemoryCache.Key, ArrayList<b>> f9044a = new LinkedHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private int f9045b;

    /* compiled from: WeakMemoryCache.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    /* compiled from: WeakMemoryCache.kt */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f9046a;

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference<Bitmap> f9047b;

        /* renamed from: c  reason: collision with root package name */
        private final Map<String, Object> f9048c;

        /* renamed from: d  reason: collision with root package name */
        private final int f9049d;

        public b(int i10, WeakReference<Bitmap> weakReference, Map<String, ? extends Object> map, int i11) {
            this.f9046a = i10;
            this.f9047b = weakReference;
            this.f9048c = map;
            this.f9049d = i11;
        }

        public final WeakReference<Bitmap> a() {
            return this.f9047b;
        }

        public final Map<String, Object> b() {
            return this.f9048c;
        }

        public final int c() {
            return this.f9046a;
        }

        public final int d() {
            return this.f9049d;
        }
    }

    private final void e() {
        int i10 = this.f9045b;
        this.f9045b = i10 + 1;
        if (i10 >= 10) {
            d();
        }
    }

    @Override // coil.memory.h
    public synchronized MemoryCache.b a(MemoryCache.Key key) {
        MemoryCache.b bVar;
        ArrayList<b> arrayList = this.f9044a.get(key);
        MemoryCache.b bVar2 = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            b bVar3 = arrayList.get(i10);
            Bitmap bitmap = bVar3.a().get();
            if (bitmap != null) {
                bVar = new MemoryCache.b(bitmap, bVar3.b());
            } else {
                bVar = null;
            }
            if (bVar != null) {
                bVar2 = bVar;
                break;
            }
            i10++;
        }
        e();
        return bVar2;
    }

    @Override // coil.memory.h
    public synchronized void b(int i10) {
        if (i10 >= 10 && i10 != 20) {
            d();
        }
    }

    @Override // coil.memory.h
    public synchronized void c(MemoryCache.Key key, Bitmap bitmap, Map<String, ? extends Object> map, int i10) {
        LinkedHashMap<MemoryCache.Key, ArrayList<b>> linkedHashMap = this.f9044a;
        ArrayList<b> arrayList = linkedHashMap.get(key);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            linkedHashMap.put(key, arrayList);
        }
        ArrayList<b> arrayList2 = arrayList;
        int identityHashCode = System.identityHashCode(bitmap);
        b bVar = new b(identityHashCode, new WeakReference(bitmap), map, i10);
        int size = arrayList2.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                b bVar2 = arrayList2.get(i11);
                if (i10 >= bVar2.d()) {
                    if (bVar2.c() == identityHashCode && bVar2.a().get() == bitmap) {
                        arrayList2.set(i11, bVar);
                    } else {
                        arrayList2.add(i11, bVar);
                    }
                } else {
                    i11++;
                }
            } else {
                arrayList2.add(bVar);
                break;
            }
        }
        e();
    }

    public final void d() {
        Object c02;
        Bitmap bitmap;
        WeakReference<Bitmap> a10;
        boolean z10;
        this.f9045b = 0;
        Iterator<ArrayList<b>> it = this.f9044a.values().iterator();
        while (it.hasNext()) {
            ArrayList<b> next = it.next();
            if (next.size() <= 1) {
                c02 = b0.c0(next);
                b bVar = (b) c02;
                if (bVar != null && (a10 = bVar.a()) != null) {
                    bitmap = a10.get();
                } else {
                    bitmap = null;
                }
                if (bitmap == null) {
                    it.remove();
                }
            } else {
                int size = next.size();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    int i12 = i11 - i10;
                    if (next.get(i12).a().get() == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        next.remove(i12);
                        i10++;
                    }
                }
                if (next.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}
