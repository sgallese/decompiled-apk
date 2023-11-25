package l6;

import i6.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ClientMetrics.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    private static final a f19564e = new C0437a().b();

    /* renamed from: a  reason: collision with root package name */
    private final f f19565a;

    /* renamed from: b  reason: collision with root package name */
    private final List<d> f19566b;

    /* renamed from: c  reason: collision with root package name */
    private final b f19567c;

    /* renamed from: d  reason: collision with root package name */
    private final String f19568d;

    /* compiled from: ClientMetrics.java */
    /* renamed from: l6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0437a {

        /* renamed from: a  reason: collision with root package name */
        private f f19569a = null;

        /* renamed from: b  reason: collision with root package name */
        private List<d> f19570b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private b f19571c = null;

        /* renamed from: d  reason: collision with root package name */
        private String f19572d = "";

        C0437a() {
        }

        public C0437a a(d dVar) {
            this.f19570b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f19569a, Collections.unmodifiableList(this.f19570b), this.f19571c, this.f19572d);
        }

        public C0437a c(String str) {
            this.f19572d = str;
            return this;
        }

        public C0437a d(b bVar) {
            this.f19571c = bVar;
            return this;
        }

        public C0437a e(f fVar) {
            this.f19569a = fVar;
            return this;
        }
    }

    a(f fVar, List<d> list, b bVar, String str) {
        this.f19565a = fVar;
        this.f19566b = list;
        this.f19567c = bVar;
        this.f19568d = str;
    }

    public static C0437a e() {
        return new C0437a();
    }

    @e9.d(tag = 4)
    public String a() {
        return this.f19568d;
    }

    @e9.d(tag = 3)
    public b b() {
        return this.f19567c;
    }

    @e9.d(tag = 2)
    public List<d> c() {
        return this.f19566b;
    }

    @e9.d(tag = 1)
    public f d() {
        return this.f19565a;
    }

    public byte[] f() {
        return m.a(this);
    }
}
