package n4;

/* compiled from: WorkProgressDao_Impl.java */
/* loaded from: classes.dex */
public final class o implements n {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.room.i f20183a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.b<m> f20184b;

    /* renamed from: c  reason: collision with root package name */
    private final androidx.room.o f20185c;

    /* renamed from: d  reason: collision with root package name */
    private final androidx.room.o f20186d;

    /* compiled from: WorkProgressDao_Impl.java */
    /* loaded from: classes.dex */
    class a extends androidx.room.b<m> {
        a(androidx.room.i iVar) {
            super(iVar);
        }

        @Override // androidx.room.o
        public String d() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // androidx.room.b
        /* renamed from: i  reason: merged with bridge method [inline-methods] */
        public void g(x3.f fVar, m mVar) {
            String str = mVar.f20181a;
            if (str == null) {
                fVar.r0(1);
            } else {
                fVar.p(1, str);
            }
            byte[] k10 = androidx.work.e.k(mVar.f20182b);
            if (k10 == null) {
                fVar.r0(2);
            } else {
                fVar.U(2, k10);
            }
        }
    }

    /* compiled from: WorkProgressDao_Impl.java */
    /* loaded from: classes.dex */
    class b extends androidx.room.o {
        b(androidx.room.i iVar) {
            super(iVar);
        }

        @Override // androidx.room.o
        public String d() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* compiled from: WorkProgressDao_Impl.java */
    /* loaded from: classes.dex */
    class c extends androidx.room.o {
        c(androidx.room.i iVar) {
            super(iVar);
        }

        @Override // androidx.room.o
        public String d() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o(androidx.room.i iVar) {
        this.f20183a = iVar;
        this.f20184b = new a(iVar);
        this.f20185c = new b(iVar);
        this.f20186d = new c(iVar);
    }

    @Override // n4.n
    public void a(String str) {
        this.f20183a.b();
        x3.f a10 = this.f20185c.a();
        if (str == null) {
            a10.r0(1);
        } else {
            a10.p(1, str);
        }
        this.f20183a.c();
        try {
            a10.u();
            this.f20183a.r();
        } finally {
            this.f20183a.g();
            this.f20185c.f(a10);
        }
    }

    @Override // n4.n
    public void b(m mVar) {
        this.f20183a.b();
        this.f20183a.c();
        try {
            this.f20184b.h(mVar);
            this.f20183a.r();
        } finally {
            this.f20183a.g();
        }
    }

    @Override // n4.n
    public void c() {
        this.f20183a.b();
        x3.f a10 = this.f20186d.a();
        this.f20183a.c();
        try {
            a10.u();
            this.f20183a.r();
        } finally {
            this.f20183a.g();
            this.f20186d.f(a10);
        }
    }
}
