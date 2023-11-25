package androidx.recyclerview.widget;

import android.view.View;

/* compiled from: ViewBoundsCheck.java */
/* loaded from: classes.dex */
class b0 {

    /* renamed from: a  reason: collision with root package name */
    final b f6681a;

    /* renamed from: b  reason: collision with root package name */
    a f6682b = new a();

    /* compiled from: ViewBoundsCheck.java */
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f6683a = 0;

        /* renamed from: b  reason: collision with root package name */
        int f6684b;

        /* renamed from: c  reason: collision with root package name */
        int f6685c;

        /* renamed from: d  reason: collision with root package name */
        int f6686d;

        /* renamed from: e  reason: collision with root package name */
        int f6687e;

        a() {
        }

        void a(int i10) {
            this.f6683a = i10 | this.f6683a;
        }

        boolean b() {
            int i10 = this.f6683a;
            if ((i10 & 7) != 0 && (i10 & (c(this.f6686d, this.f6684b) << 0)) == 0) {
                return false;
            }
            int i11 = this.f6683a;
            if ((i11 & 112) != 0 && (i11 & (c(this.f6686d, this.f6685c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f6683a;
            if ((i12 & 1792) != 0 && (i12 & (c(this.f6687e, this.f6684b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f6683a;
            if ((i13 & 28672) != 0 && (i13 & (c(this.f6687e, this.f6685c) << 12)) == 0) {
                return false;
            }
            return true;
        }

        int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            if (i10 == i11) {
                return 2;
            }
            return 4;
        }

        void d() {
            this.f6683a = 0;
        }

        void e(int i10, int i11, int i12, int i13) {
            this.f6684b = i10;
            this.f6685c = i11;
            this.f6686d = i12;
            this.f6687e = i13;
        }
    }

    /* compiled from: ViewBoundsCheck.java */
    /* loaded from: classes.dex */
    interface b {
        View a(int i10);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0(b bVar) {
        this.f6681a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View a(int i10, int i11, int i12, int i13) {
        int i14;
        int c10 = this.f6681a.c();
        int d10 = this.f6681a.d();
        if (i11 > i10) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        View view = null;
        while (i10 != i11) {
            View a10 = this.f6681a.a(i10);
            this.f6682b.e(c10, d10, this.f6681a.b(a10), this.f6681a.e(a10));
            if (i12 != 0) {
                this.f6682b.d();
                this.f6682b.a(i12);
                if (this.f6682b.b()) {
                    return a10;
                }
            }
            if (i13 != 0) {
                this.f6682b.d();
                this.f6682b.a(i13);
                if (this.f6682b.b()) {
                    view = a10;
                }
            }
            i10 += i14;
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(View view, int i10) {
        this.f6682b.e(this.f6681a.c(), this.f6681a.d(), this.f6681a.b(view), this.f6681a.e(view));
        if (i10 != 0) {
            this.f6682b.d();
            this.f6682b.a(i10);
            return this.f6682b.b();
        }
        return false;
    }
}
