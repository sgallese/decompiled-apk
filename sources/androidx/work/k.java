package androidx.work;

/* compiled from: InputMergerFactory.java */
/* loaded from: classes.dex */
public abstract class k {

    /* compiled from: InputMergerFactory.java */
    /* loaded from: classes.dex */
    class a extends k {
        a() {
        }

        @Override // androidx.work.k
        public j a(String str) {
            return null;
        }
    }

    public static k c() {
        return new a();
    }

    public abstract j a(String str);

    public final j b(String str) {
        j a10 = a(str);
        if (a10 == null) {
            return j.a(str);
        }
        return a10;
    }
}
