package q6;

import androidx.recyclerview.widget.m;
import com.google.auto.value.AutoValue;
import q6.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EventStoreConfig.java */
@AutoValue
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    static final e f21501a = a().f(10485760).d(m.e.DEFAULT_DRAG_ANIMATION_DURATION).b(10000).c(604800000).e(81920).a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EventStoreConfig.java */
    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
        abstract e a();

        abstract a b(int i10);

        abstract a c(long j10);

        abstract a d(int i10);

        abstract a e(int i10);

        abstract a f(long j10);
    }

    static a a() {
        return new a.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int e();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long f();
}
