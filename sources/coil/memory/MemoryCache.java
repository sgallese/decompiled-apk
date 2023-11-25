package coil.memory;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import ec.n0;
import g5.l;
import java.util.LinkedHashMap;
import java.util.Map;
import qc.q;

/* compiled from: MemoryCache.kt */
/* loaded from: classes.dex */
public interface MemoryCache {

    /* compiled from: MemoryCache.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f9024a;

        /* renamed from: b  reason: collision with root package name */
        private double f9025b;

        /* renamed from: c  reason: collision with root package name */
        private int f9026c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f9027d = true;

        /* renamed from: e  reason: collision with root package name */
        private boolean f9028e = true;

        public a(Context context) {
            this.f9024a = context;
            this.f9025b = l.e(context);
        }

        public final MemoryCache a() {
            h bVar;
            g aVar;
            int i10;
            if (this.f9028e) {
                bVar = new f();
            } else {
                bVar = new coil.memory.b();
            }
            if (this.f9027d) {
                double d10 = this.f9025b;
                if (d10 > 0.0d) {
                    i10 = l.c(this.f9024a, d10);
                } else {
                    i10 = this.f9026c;
                }
                if (i10 > 0) {
                    aVar = new e(i10, bVar);
                } else {
                    aVar = new coil.memory.a(bVar);
                }
            } else {
                aVar = new coil.memory.a(bVar);
            }
            return new d(aVar, bVar);
        }
    }

    /* compiled from: MemoryCache.kt */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Bitmap f9029a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, Object> f9030b;

        public b(Bitmap bitmap, Map<String, ? extends Object> map) {
            this.f9029a = bitmap;
            this.f9030b = map;
        }

        public final Bitmap a() {
            return this.f9029a;
        }

        public final Map<String, Object> b() {
            return this.f9030b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (q.d(this.f9029a, bVar.f9029a) && q.d(this.f9030b, bVar.f9030b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f9029a.hashCode() * 31) + this.f9030b.hashCode();
        }

        public String toString() {
            return "Value(bitmap=" + this.f9029a + ", extras=" + this.f9030b + ')';
        }
    }

    b a(Key key);

    void b(int i10);

    void c(Key key, b bVar);

    /* compiled from: MemoryCache.kt */
    /* loaded from: classes.dex */
    public static final class Key implements Parcelable {

        /* renamed from: f  reason: collision with root package name */
        private final String f9022f;

        /* renamed from: m  reason: collision with root package name */
        private final Map<String, String> f9023m;

        /* renamed from: p  reason: collision with root package name */
        private static final b f9021p = new b(null);
        @Deprecated
        public static final Parcelable.Creator<Key> CREATOR = new a();

        /* compiled from: MemoryCache.kt */
        /* loaded from: classes.dex */
        public static final class a implements Parcelable.Creator<Key> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public Key createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                q.f(readString);
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i10 = 0; i10 < readInt; i10++) {
                    String readString2 = parcel.readString();
                    q.f(readString2);
                    String readString3 = parcel.readString();
                    q.f(readString3);
                    linkedHashMap.put(readString2, readString3);
                }
                return new Key(readString, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public Key[] newArray(int i10) {
                return new Key[i10];
            }
        }

        /* compiled from: MemoryCache.kt */
        /* loaded from: classes.dex */
        private static final class b {
            private b() {
            }

            public /* synthetic */ b(qc.h hVar) {
                this();
            }
        }

        public Key(String str, Map<String, String> map) {
            this.f9022f = str;
            this.f9023m = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Key b(Key key, String str, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = key.f9022f;
            }
            if ((i10 & 2) != 0) {
                map = key.f9023m;
            }
            return key.a(str, map);
        }

        public final Key a(String str, Map<String, String> map) {
            return new Key(str, map);
        }

        public final Map<String, String> c() {
            return this.f9023m;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Key) {
                Key key = (Key) obj;
                if (q.d(this.f9022f, key.f9022f) && q.d(this.f9023m, key.f9023m)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f9022f.hashCode() * 31) + this.f9023m.hashCode();
        }

        public String toString() {
            return "Key(key=" + this.f9022f + ", extras=" + this.f9023m + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f9022f);
            parcel.writeInt(this.f9023m.size());
            for (Map.Entry<String, String> entry : this.f9023m.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                parcel.writeString(key);
                parcel.writeString(value);
            }
        }

        public /* synthetic */ Key(String str, Map map, int i10, qc.h hVar) {
            this(str, (i10 & 2) != 0 ? n0.h() : map);
        }
    }
}
