package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ViewTypeStorage.java */
/* loaded from: classes.dex */
interface d0 {

    /* compiled from: ViewTypeStorage.java */
    /* loaded from: classes.dex */
    public static class a implements d0 {

        /* renamed from: a  reason: collision with root package name */
        SparseArray<s> f6707a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        int f6708b = 0;

        /* compiled from: ViewTypeStorage.java */
        /* renamed from: androidx.recyclerview.widget.d0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0155a implements c {

            /* renamed from: a  reason: collision with root package name */
            private SparseIntArray f6709a = new SparseIntArray(1);

            /* renamed from: b  reason: collision with root package name */
            private SparseIntArray f6710b = new SparseIntArray(1);

            /* renamed from: c  reason: collision with root package name */
            final s f6711c;

            C0155a(s sVar) {
                this.f6711c = sVar;
            }

            @Override // androidx.recyclerview.widget.d0.c
            public int a(int i10) {
                int indexOfKey = this.f6710b.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return this.f6710b.valueAt(indexOfKey);
                }
                throw new IllegalStateException("requested global type " + i10 + " does not belong to the adapter:" + this.f6711c.f6933c);
            }

            @Override // androidx.recyclerview.widget.d0.c
            public int b(int i10) {
                int indexOfKey = this.f6709a.indexOfKey(i10);
                if (indexOfKey > -1) {
                    return this.f6709a.valueAt(indexOfKey);
                }
                int c10 = a.this.c(this.f6711c);
                this.f6709a.put(i10, c10);
                this.f6710b.put(c10, i10);
                return c10;
            }
        }

        @Override // androidx.recyclerview.widget.d0
        public s a(int i10) {
            s sVar = this.f6707a.get(i10);
            if (sVar != null) {
                return sVar;
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i10);
        }

        @Override // androidx.recyclerview.widget.d0
        public c b(s sVar) {
            return new C0155a(sVar);
        }

        int c(s sVar) {
            int i10 = this.f6708b;
            this.f6708b = i10 + 1;
            this.f6707a.put(i10, sVar);
            return i10;
        }
    }

    /* compiled from: ViewTypeStorage.java */
    /* loaded from: classes.dex */
    public interface c {
        int a(int i10);

        int b(int i10);
    }

    s a(int i10);

    c b(s sVar);

    /* compiled from: ViewTypeStorage.java */
    /* loaded from: classes.dex */
    public static class b implements d0 {

        /* renamed from: a  reason: collision with root package name */
        SparseArray<List<s>> f6713a = new SparseArray<>();

        @Override // androidx.recyclerview.widget.d0
        public s a(int i10) {
            List<s> list = this.f6713a.get(i10);
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i10);
        }

        @Override // androidx.recyclerview.widget.d0
        public c b(s sVar) {
            return new a(sVar);
        }

        /* compiled from: ViewTypeStorage.java */
        /* loaded from: classes.dex */
        class a implements c {

            /* renamed from: a  reason: collision with root package name */
            final s f6714a;

            a(s sVar) {
                this.f6714a = sVar;
            }

            @Override // androidx.recyclerview.widget.d0.c
            public int b(int i10) {
                List<s> list = b.this.f6713a.get(i10);
                if (list == null) {
                    list = new ArrayList<>();
                    b.this.f6713a.put(i10, list);
                }
                if (!list.contains(this.f6714a)) {
                    list.add(this.f6714a);
                }
                return i10;
            }

            @Override // androidx.recyclerview.widget.d0.c
            public int a(int i10) {
                return i10;
            }
        }
    }
}
