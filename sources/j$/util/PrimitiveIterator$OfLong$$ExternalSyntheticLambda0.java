package j$.util;

import j$.util.function.LongConsumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class PrimitiveIterator$OfLong$$ExternalSyntheticLambda0 implements LongConsumer {
    public final /* synthetic */ Consumer f$0;

    @Override // java.util.function.LongConsumer
    public final void accept(long j10) {
        this.f$0.accept(Long.valueOf(j10));
    }

    public /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer$CC.$default$andThen(this, longConsumer);
    }
}
