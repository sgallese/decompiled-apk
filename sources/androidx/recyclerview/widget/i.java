package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: DiffUtil.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private static final Comparator<d> f6787a = new a();

    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    class a implements Comparator<d> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            return dVar.f6790a - dVar2.f6790a;
        }
    }

    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract boolean areContentsTheSame(int i10, int i11);

        public abstract boolean areItemsTheSame(int i10, int i11);

        public Object getChangePayload(int i10, int i11) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final int[] f6788a;

        /* renamed from: b  reason: collision with root package name */
        private final int f6789b;

        c(int i10) {
            int[] iArr = new int[i10];
            this.f6788a = iArr;
            this.f6789b = iArr.length / 2;
        }

        int[] a() {
            return this.f6788a;
        }

        int b(int i10) {
            return this.f6788a[i10 + this.f6789b];
        }

        void c(int i10, int i11) {
            this.f6788a[i10 + this.f6789b] = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f6790a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6791b;

        /* renamed from: c  reason: collision with root package name */
        public final int f6792c;

        d(int i10, int i11, int i12) {
            this.f6790a = i10;
            this.f6791b = i11;
            this.f6792c = i12;
        }

        int a() {
            return this.f6790a + this.f6792c;
        }

        int b() {
            return this.f6791b + this.f6792c;
        }
    }

    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private final List<d> f6793a;

        /* renamed from: b  reason: collision with root package name */
        private final int[] f6794b;

        /* renamed from: c  reason: collision with root package name */
        private final int[] f6795c;

        /* renamed from: d  reason: collision with root package name */
        private final b f6796d;

        /* renamed from: e  reason: collision with root package name */
        private final int f6797e;

        /* renamed from: f  reason: collision with root package name */
        private final int f6798f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f6799g;

        e(b bVar, List<d> list, int[] iArr, int[] iArr2, boolean z10) {
            this.f6793a = list;
            this.f6794b = iArr;
            this.f6795c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f6796d = bVar;
            this.f6797e = bVar.getOldListSize();
            this.f6798f = bVar.getNewListSize();
            this.f6799g = z10;
            a();
            f();
        }

        private void a() {
            d dVar;
            if (this.f6793a.isEmpty()) {
                dVar = null;
            } else {
                dVar = this.f6793a.get(0);
            }
            if (dVar == null || dVar.f6790a != 0 || dVar.f6791b != 0) {
                this.f6793a.add(0, new d(0, 0, 0));
            }
            this.f6793a.add(new d(this.f6797e, this.f6798f, 0));
        }

        private void e(int i10) {
            int i11;
            int size = this.f6793a.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                d dVar = this.f6793a.get(i13);
                while (i12 < dVar.f6791b) {
                    if (this.f6795c[i12] == 0 && this.f6796d.areItemsTheSame(i10, i12)) {
                        if (this.f6796d.areContentsTheSame(i10, i12)) {
                            i11 = 8;
                        } else {
                            i11 = 4;
                        }
                        this.f6794b[i10] = (i12 << 4) | i11;
                        this.f6795c[i12] = (i10 << 4) | i11;
                        return;
                    }
                    i12++;
                }
                i12 = dVar.b();
            }
        }

        private void f() {
            int i10;
            for (d dVar : this.f6793a) {
                for (int i11 = 0; i11 < dVar.f6792c; i11++) {
                    int i12 = dVar.f6790a + i11;
                    int i13 = dVar.f6791b + i11;
                    if (this.f6796d.areContentsTheSame(i12, i13)) {
                        i10 = 1;
                    } else {
                        i10 = 2;
                    }
                    this.f6794b[i12] = (i13 << 4) | i10;
                    this.f6795c[i13] = (i12 << 4) | i10;
                }
            }
            if (this.f6799g) {
                g();
            }
        }

        private void g() {
            int i10 = 0;
            for (d dVar : this.f6793a) {
                while (i10 < dVar.f6790a) {
                    if (this.f6794b[i10] == 0) {
                        e(i10);
                    }
                    i10++;
                }
                i10 = dVar.a();
            }
        }

        private static g h(Collection<g> collection, int i10, boolean z10) {
            g gVar;
            Iterator<g> it = collection.iterator();
            while (true) {
                if (it.hasNext()) {
                    gVar = it.next();
                    if (gVar.f6800a == i10 && gVar.f6802c == z10) {
                        it.remove();
                        break;
                    }
                } else {
                    gVar = null;
                    break;
                }
            }
            while (it.hasNext()) {
                g next = it.next();
                if (z10) {
                    next.f6801b--;
                } else {
                    next.f6801b++;
                }
            }
            return gVar;
        }

        public int b(int i10) {
            if (i10 >= 0 && i10 < this.f6797e) {
                int i11 = this.f6794b[i10];
                if ((i11 & 15) == 0) {
                    return -1;
                }
                return i11 >> 4;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i10 + ", old list size = " + this.f6797e);
        }

        public void c(r rVar) {
            androidx.recyclerview.widget.d dVar;
            int i10;
            if (rVar instanceof androidx.recyclerview.widget.d) {
                dVar = (androidx.recyclerview.widget.d) rVar;
            } else {
                dVar = new androidx.recyclerview.widget.d(rVar);
            }
            int i11 = this.f6797e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i12 = this.f6797e;
            int i13 = this.f6798f;
            for (int size = this.f6793a.size() - 1; size >= 0; size--) {
                d dVar2 = this.f6793a.get(size);
                int a10 = dVar2.a();
                int b10 = dVar2.b();
                while (true) {
                    if (i12 <= a10) {
                        break;
                    }
                    i12--;
                    int i14 = this.f6794b[i12];
                    if ((i14 & 12) != 0) {
                        int i15 = i14 >> 4;
                        g h10 = h(arrayDeque, i15, false);
                        if (h10 != null) {
                            int i16 = (i11 - h10.f6801b) - 1;
                            dVar.c(i12, i16);
                            if ((i14 & 4) != 0) {
                                dVar.d(i16, 1, this.f6796d.getChangePayload(i12, i15));
                            }
                        } else {
                            arrayDeque.add(new g(i12, (i11 - i12) - 1, true));
                        }
                    } else {
                        dVar.b(i12, 1);
                        i11--;
                    }
                }
                while (i13 > b10) {
                    i13--;
                    int i17 = this.f6795c[i13];
                    if ((i17 & 12) != 0) {
                        int i18 = i17 >> 4;
                        g h11 = h(arrayDeque, i18, true);
                        if (h11 == null) {
                            arrayDeque.add(new g(i13, i11 - i12, false));
                        } else {
                            dVar.c((i11 - h11.f6801b) - 1, i12);
                            if ((i17 & 4) != 0) {
                                dVar.d(i12, 1, this.f6796d.getChangePayload(i18, i13));
                            }
                        }
                    } else {
                        dVar.a(i12, 1);
                        i11++;
                    }
                }
                int i19 = dVar2.f6790a;
                int i20 = dVar2.f6791b;
                for (i10 = 0; i10 < dVar2.f6792c; i10++) {
                    if ((this.f6794b[i19] & 15) == 2) {
                        dVar.d(i19, 1, this.f6796d.getChangePayload(i19, i20));
                    }
                    i19++;
                    i20++;
                }
                i12 = dVar2.f6790a;
                i13 = dVar2.f6791b;
            }
            dVar.e();
        }

        public void d(RecyclerView.h hVar) {
            c(new androidx.recyclerview.widget.b(hVar));
        }
    }

    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static abstract class f<T> {
        public abstract boolean areContentsTheSame(T t10, T t11);

        public abstract boolean areItemsTheSame(T t10, T t11);

        public Object getChangePayload(T t10, T t11) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        int f6800a;

        /* renamed from: b  reason: collision with root package name */
        int f6801b;

        /* renamed from: c  reason: collision with root package name */
        boolean f6802c;

        g(int i10, int i11, boolean z10) {
            this.f6800a = i10;
            this.f6801b = i11;
            this.f6802c = z10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        int f6803a;

        /* renamed from: b  reason: collision with root package name */
        int f6804b;

        /* renamed from: c  reason: collision with root package name */
        int f6805c;

        /* renamed from: d  reason: collision with root package name */
        int f6806d;

        public h() {
        }

        int a() {
            return this.f6806d - this.f6805c;
        }

        int b() {
            return this.f6804b - this.f6803a;
        }

        public h(int i10, int i11, int i12, int i13) {
            this.f6803a = i10;
            this.f6804b = i11;
            this.f6805c = i12;
            this.f6806d = i13;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.i$i  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0158i {

        /* renamed from: a  reason: collision with root package name */
        public int f6807a;

        /* renamed from: b  reason: collision with root package name */
        public int f6808b;

        /* renamed from: c  reason: collision with root package name */
        public int f6809c;

        /* renamed from: d  reason: collision with root package name */
        public int f6810d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f6811e;

        C0158i() {
        }

        int a() {
            return Math.min(this.f6809c - this.f6807a, this.f6810d - this.f6808b);
        }

        boolean b() {
            if (this.f6810d - this.f6808b != this.f6809c - this.f6807a) {
                return true;
            }
            return false;
        }

        boolean c() {
            if (this.f6810d - this.f6808b > this.f6809c - this.f6807a) {
                return true;
            }
            return false;
        }

        d d() {
            if (b()) {
                if (this.f6811e) {
                    return new d(this.f6807a, this.f6808b, a());
                }
                if (c()) {
                    return new d(this.f6807a, this.f6808b + 1, a());
                }
                return new d(this.f6807a + 1, this.f6808b, a());
            }
            int i10 = this.f6807a;
            return new d(i10, this.f6808b, this.f6809c - i10);
        }
    }

    private static C0158i a(h hVar, b bVar, c cVar, c cVar2, int i10) {
        boolean z10;
        int b10;
        int i11;
        int i12;
        int i13;
        if ((hVar.b() - hVar.a()) % 2 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int b11 = hVar.b() - hVar.a();
        int i14 = -i10;
        for (int i15 = i14; i15 <= i10; i15 += 2) {
            if (i15 != i14 && (i15 == i10 || cVar2.b(i15 + 1) >= cVar2.b(i15 - 1))) {
                b10 = cVar2.b(i15 - 1);
                i11 = b10 - 1;
            } else {
                b10 = cVar2.b(i15 + 1);
                i11 = b10;
            }
            int i16 = hVar.f6806d - ((hVar.f6804b - i11) - i15);
            if (i10 != 0 && i11 == b10) {
                i12 = i16 + 1;
            } else {
                i12 = i16;
            }
            while (i11 > hVar.f6803a && i16 > hVar.f6805c && bVar.areItemsTheSame(i11 - 1, i16 - 1)) {
                i11--;
                i16--;
            }
            cVar2.c(i15, i11);
            if (z10 && (i13 = b11 - i15) >= i14 && i13 <= i10 && cVar.b(i13) >= i11) {
                C0158i c0158i = new C0158i();
                c0158i.f6807a = i11;
                c0158i.f6808b = i16;
                c0158i.f6809c = b10;
                c0158i.f6810d = i12;
                c0158i.f6811e = true;
                return c0158i;
            }
        }
        return null;
    }

    public static e b(b bVar) {
        return c(bVar, true);
    }

    public static e c(b bVar, boolean z10) {
        h hVar;
        int oldListSize = bVar.getOldListSize();
        int newListSize = bVar.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new h(0, oldListSize, 0, newListSize));
        int i10 = ((((oldListSize + newListSize) + 1) / 2) * 2) + 1;
        c cVar = new c(i10);
        c cVar2 = new c(i10);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            h hVar2 = (h) arrayList2.remove(arrayList2.size() - 1);
            C0158i e10 = e(hVar2, bVar, cVar, cVar2);
            if (e10 != null) {
                if (e10.a() > 0) {
                    arrayList.add(e10.d());
                }
                if (arrayList3.isEmpty()) {
                    hVar = new h();
                } else {
                    hVar = (h) arrayList3.remove(arrayList3.size() - 1);
                }
                hVar.f6803a = hVar2.f6803a;
                hVar.f6805c = hVar2.f6805c;
                hVar.f6804b = e10.f6807a;
                hVar.f6806d = e10.f6808b;
                arrayList2.add(hVar);
                hVar2.f6804b = hVar2.f6804b;
                hVar2.f6806d = hVar2.f6806d;
                hVar2.f6803a = e10.f6809c;
                hVar2.f6805c = e10.f6810d;
                arrayList2.add(hVar2);
            } else {
                arrayList3.add(hVar2);
            }
        }
        Collections.sort(arrayList, f6787a);
        return new e(bVar, arrayList, cVar.a(), cVar2.a(), z10);
    }

    private static C0158i d(h hVar, b bVar, c cVar, c cVar2, int i10) {
        int b10;
        int i11;
        int i12;
        boolean z10 = true;
        if (Math.abs(hVar.b() - hVar.a()) % 2 != 1) {
            z10 = false;
        }
        int b11 = hVar.b() - hVar.a();
        int i13 = -i10;
        for (int i14 = i13; i14 <= i10; i14 += 2) {
            if (i14 != i13 && (i14 == i10 || cVar.b(i14 + 1) <= cVar.b(i14 - 1))) {
                b10 = cVar.b(i14 - 1);
                i11 = b10 + 1;
            } else {
                b10 = cVar.b(i14 + 1);
                i11 = b10;
            }
            int i15 = (hVar.f6805c + (i11 - hVar.f6803a)) - i14;
            int i16 = (i10 != 0 && i11 == b10) ? i15 - 1 : i15;
            while (i11 < hVar.f6804b && i15 < hVar.f6806d && bVar.areItemsTheSame(i11, i15)) {
                i11++;
                i15++;
            }
            cVar.c(i14, i11);
            if (z10 && (i12 = b11 - i14) >= i13 + 1 && i12 <= i10 - 1 && cVar2.b(i12) <= i11) {
                C0158i c0158i = new C0158i();
                c0158i.f6807a = b10;
                c0158i.f6808b = i16;
                c0158i.f6809c = i11;
                c0158i.f6810d = i15;
                c0158i.f6811e = false;
                return c0158i;
            }
        }
        return null;
    }

    private static C0158i e(h hVar, b bVar, c cVar, c cVar2) {
        if (hVar.b() >= 1 && hVar.a() >= 1) {
            int b10 = ((hVar.b() + hVar.a()) + 1) / 2;
            cVar.c(1, hVar.f6803a);
            cVar2.c(1, hVar.f6804b);
            for (int i10 = 0; i10 < b10; i10++) {
                C0158i d10 = d(hVar, bVar, cVar, cVar2, i10);
                if (d10 != null) {
                    return d10;
                }
                C0158i a10 = a(hVar, bVar, cVar, cVar2, i10);
                if (a10 != null) {
                    return a10;
                }
            }
        }
        return null;
    }
}
