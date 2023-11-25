package com.habitrpg.common.habitica.extensions;

import android.text.style.URLSpan;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: TextViewExtensions.kt */
/* loaded from: classes4.dex */
final class TextViewExtensionsKt$handleUrlClicks$1$1$1 extends r implements pc.a<w> {
    final /* synthetic */ URLSpan $it;
    final /* synthetic */ l<String, w> $onClicked;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextViewExtensionsKt$handleUrlClicks$1$1$1(l<? super String, w> lVar, URLSpan uRLSpan) {
        super(0);
        this.$onClicked = lVar;
        this.$it = uRLSpan;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        l<String, w> lVar = this.$onClicked;
        if (lVar != null) {
            String url = this.$it.getURL();
            q.h(url, "getURL(...)");
            lVar.invoke(url);
        }
    }
}
