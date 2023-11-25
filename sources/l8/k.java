package l8;

import java.util.concurrent.Executor;

/* compiled from: FirebaseExecutors.java */
/* loaded from: classes3.dex */
public class k {

    /* compiled from: FirebaseExecutors.java */
    /* loaded from: classes3.dex */
    private enum a implements Executor {
        INSTANCE;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return a.INSTANCE;
    }

    public static Executor b(Executor executor) {
        return new l(executor);
    }
}
