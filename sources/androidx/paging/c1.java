package androidx.paging;

/* compiled from: NullPaddedListDiffHelper.kt */
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a  reason: collision with root package name */
    public static final c1 f5429a = new c1();

    /* compiled from: NullPaddedListDiffHelper.kt */
    /* loaded from: classes.dex */
    private static final class a<T> implements androidx.recyclerview.widget.r {

        /* renamed from: i  reason: collision with root package name */
        public static final C0119a f5430i = new C0119a(null);

        /* renamed from: a  reason: collision with root package name */
        private final a1<T> f5431a;

        /* renamed from: b  reason: collision with root package name */
        private final a1<T> f5432b;

        /* renamed from: c  reason: collision with root package name */
        private final androidx.recyclerview.widget.r f5433c;

        /* renamed from: d  reason: collision with root package name */
        private int f5434d;

        /* renamed from: e  reason: collision with root package name */
        private int f5435e;

        /* renamed from: f  reason: collision with root package name */
        private int f5436f;

        /* renamed from: g  reason: collision with root package name */
        private int f5437g;

        /* renamed from: h  reason: collision with root package name */
        private int f5438h;

        /* compiled from: NullPaddedListDiffHelper.kt */
        /* renamed from: androidx.paging.c1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0119a {
            private C0119a() {
            }

            public /* synthetic */ C0119a(qc.h hVar) {
                this();
            }
        }

        public a(a1<T> a1Var, a1<T> a1Var2, androidx.recyclerview.widget.r rVar) {
            qc.q.i(a1Var, "oldList");
            qc.q.i(a1Var2, "newList");
            qc.q.i(rVar, "callback");
            this.f5431a = a1Var;
            this.f5432b = a1Var2;
            this.f5433c = rVar;
            this.f5434d = a1Var.g();
            this.f5435e = a1Var.h();
            this.f5436f = a1Var.f();
            this.f5437g = 1;
            this.f5438h = 1;
        }

        private final boolean e(int i10, int i11) {
            if (i10 < this.f5436f || this.f5438h == 2) {
                return false;
            }
            int min = Math.min(i11, this.f5435e);
            if (min > 0) {
                this.f5438h = 3;
                this.f5433c.d(this.f5434d + i10, min, t.PLACEHOLDER_TO_ITEM);
                this.f5435e -= min;
            }
            int i12 = i11 - min;
            if (i12 > 0) {
                this.f5433c.a(i10 + min + this.f5434d, i12);
                return true;
            }
            return true;
        }

        private final boolean f(int i10, int i11) {
            if (i10 > 0 || this.f5437g == 2) {
                return false;
            }
            int min = Math.min(i11, this.f5434d);
            if (min > 0) {
                this.f5437g = 3;
                this.f5433c.d((0 - min) + this.f5434d, min, t.PLACEHOLDER_TO_ITEM);
                this.f5434d -= min;
            }
            int i12 = i11 - min;
            if (i12 > 0) {
                this.f5433c.a(this.f5434d + 0, i12);
                return true;
            }
            return true;
        }

        private final boolean g(int i10, int i11) {
            int d10;
            if (i10 + i11 >= this.f5436f && this.f5438h != 3) {
                d10 = vc.l.d(Math.min(this.f5432b.h() - this.f5435e, i11), 0);
                int i12 = i11 - d10;
                if (d10 > 0) {
                    this.f5438h = 2;
                    this.f5433c.d(this.f5434d + i10, d10, t.ITEM_TO_PLACEHOLDER);
                    this.f5435e += d10;
                }
                if (i12 > 0) {
                    this.f5433c.b(i10 + d10 + this.f5434d, i12);
                    return true;
                }
                return true;
            }
            return false;
        }

        private final boolean h(int i10, int i11) {
            int d10;
            if (i10 <= 0 && this.f5437g != 3) {
                d10 = vc.l.d(Math.min(this.f5432b.g() - this.f5434d, i11), 0);
                int i12 = i11 - d10;
                if (i12 > 0) {
                    this.f5433c.b(this.f5434d + 0, i12);
                }
                if (d10 > 0) {
                    this.f5437g = 2;
                    this.f5433c.d(this.f5434d + 0, d10, t.ITEM_TO_PLACEHOLDER);
                    this.f5434d += d10;
                    return true;
                }
                return true;
            }
            return false;
        }

        private final void i() {
            int min = Math.min(this.f5431a.g(), this.f5434d);
            int g10 = this.f5432b.g() - this.f5434d;
            if (g10 > 0) {
                if (min > 0) {
                    this.f5433c.d(0, min, t.PLACEHOLDER_POSITION_CHANGE);
                }
                this.f5433c.a(0, g10);
            } else if (g10 < 0) {
                this.f5433c.b(0, -g10);
                int i10 = min + g10;
                if (i10 > 0) {
                    this.f5433c.d(0, i10, t.PLACEHOLDER_POSITION_CHANGE);
                }
            }
            this.f5434d = this.f5432b.g();
        }

        private final void k() {
            boolean z10;
            int min = Math.min(this.f5431a.h(), this.f5435e);
            int h10 = this.f5432b.h();
            int i10 = this.f5435e;
            int i11 = h10 - i10;
            int i12 = this.f5434d + this.f5436f + i10;
            int i13 = i12 - min;
            if (i13 != this.f5431a.getSize() - min) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 > 0) {
                this.f5433c.a(i12, i11);
            } else if (i11 < 0) {
                this.f5433c.b(i12 + i11, -i11);
                min += i11;
            }
            if (min > 0 && z10) {
                this.f5433c.d(i13, min, t.PLACEHOLDER_POSITION_CHANGE);
            }
            this.f5435e = this.f5432b.h();
        }

        @Override // androidx.recyclerview.widget.r
        public void a(int i10, int i11) {
            if (!e(i10, i11) && !f(i10, i11)) {
                this.f5433c.a(i10 + this.f5434d, i11);
            }
            this.f5436f += i11;
        }

        @Override // androidx.recyclerview.widget.r
        public void b(int i10, int i11) {
            if (!g(i10, i11) && !h(i10, i11)) {
                this.f5433c.b(i10 + this.f5434d, i11);
            }
            this.f5436f -= i11;
        }

        @Override // androidx.recyclerview.widget.r
        public void c(int i10, int i11) {
            androidx.recyclerview.widget.r rVar = this.f5433c;
            int i12 = this.f5434d;
            rVar.c(i10 + i12, i11 + i12);
        }

        @Override // androidx.recyclerview.widget.r
        public void d(int i10, int i11, Object obj) {
            this.f5433c.d(i10 + this.f5434d, i11, obj);
        }

        public final void j() {
            i();
            k();
        }
    }

    private c1() {
    }

    public final <T> void a(a1<T> a1Var, a1<T> a1Var2, androidx.recyclerview.widget.r rVar, z0 z0Var) {
        qc.q.i(a1Var, "oldList");
        qc.q.i(a1Var2, "newList");
        qc.q.i(rVar, "callback");
        qc.q.i(z0Var, "diffResult");
        a aVar = new a(a1Var, a1Var2, rVar);
        z0Var.a().c(aVar);
        aVar.j();
    }
}
