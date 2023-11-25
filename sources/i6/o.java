package i6;

import com.google.auto.value.AutoValue;
import i6.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SendRequest.java */
@AutoValue
/* loaded from: classes.dex */
public abstract class o {

    /* compiled from: SendRequest.java */
    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract o a();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a b(g6.b bVar);

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a c(g6.c<?> cVar);

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a d(g6.e<?, byte[]> eVar);

        public abstract a e(p pVar);

        public abstract a f(String str);
    }

    public static a a() {
        return new c.b();
    }

    public abstract g6.b b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract g6.c<?> c();

    public byte[] d() {
        return e().apply(c().b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract g6.e<?, byte[]> e();

    public abstract p f();

    public abstract String g();
}
