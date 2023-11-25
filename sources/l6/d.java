package l6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: LogSourceMetrics.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: c  reason: collision with root package name */
    private static final d f19581c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final String f19582a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f19583b;

    /* compiled from: LogSourceMetrics.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f19584a = "";

        /* renamed from: b  reason: collision with root package name */
        private List<c> f19585b = new ArrayList();

        a() {
        }

        public d a() {
            return new d(this.f19584a, Collections.unmodifiableList(this.f19585b));
        }

        public a b(List<c> list) {
            this.f19585b = list;
            return this;
        }

        public a c(String str) {
            this.f19584a = str;
            return this;
        }
    }

    d(String str, List<c> list) {
        this.f19582a = str;
        this.f19583b = list;
    }

    public static a c() {
        return new a();
    }

    @e9.d(tag = 2)
    public List<c> a() {
        return this.f19583b;
    }

    @e9.d(tag = 1)
    public String b() {
        return this.f19582a;
    }
}
