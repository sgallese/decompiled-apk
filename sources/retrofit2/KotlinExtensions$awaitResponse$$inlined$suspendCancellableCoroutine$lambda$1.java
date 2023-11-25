package retrofit2;

import dc.w;
import qc.r;

/* compiled from: KotlinExtensions.kt */
/* loaded from: classes4.dex */
final class KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1 extends r implements pc.l<Throwable, w> {
    final /* synthetic */ Call $this_awaitResponse$inlined;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1(Call call) {
        super(1);
        this.$this_awaitResponse$inlined = call;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Throwable th) {
        invoke2(th);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.$this_awaitResponse$inlined.cancel();
    }
}
