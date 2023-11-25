package com.habitrpg.android.habitica.ui.activities;

/* compiled from: MainActivity.kt */
/* loaded from: classes4.dex */
final class MainActivity$onCreate$6$1$2$1$1$1 extends qc.r implements pc.l<String, dc.w> {
    final /* synthetic */ pc.a<dc.w> $onClose;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$onCreate$6$1$2$1$1$1(pc.a<dc.w> aVar) {
        super(1);
        this.$onClose = aVar;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(String str) {
        invoke2(str);
        return dc.w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        qc.q.i(str, "it");
        this.$onClose.invoke();
        FullProfileActivity.Companion.open(str);
    }
}
