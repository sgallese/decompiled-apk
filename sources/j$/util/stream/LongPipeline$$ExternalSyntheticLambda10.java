package j$.util.stream;

import j$.util.function.LongConsumer$CC;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class LongPipeline$$ExternalSyntheticLambda10 implements LongConsumer {
    public final /* synthetic */ Sink f$0;

    @Override // java.util.function.LongConsumer
    public final void accept(long j10) {
        this.f$0.accept(j10);
    }

    public /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer$CC.$default$andThen(this, longConsumer);
    }
}
