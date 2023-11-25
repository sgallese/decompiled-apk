package com.habitrpg.android.habitica.ui.fragments.social.party;

import android.content.Context;
import android.graphics.drawable.Drawable;
import dc.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PartyDetailFragment.kt */
/* loaded from: classes4.dex */
public final class PartyDetailFragment$updateQuestContent$1$1 extends qc.r implements pc.l<Drawable, w> {
    final /* synthetic */ Context $context;
    final /* synthetic */ PartyDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartyDetailFragment$updateQuestContent$1$1(PartyDetailFragment partyDetailFragment, Context context) {
        super(1);
        this.this$0 = partyDetailFragment;
        this.$context = context;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Drawable drawable) {
        invoke2(drawable);
        return w.f13270a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if (((r0 == null || (r0 = r0.questImageView) == null) ? null : r0.getDrawable()) == null) goto L19;
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(android.graphics.drawable.Drawable r4) {
        /*
            r3 = this;
            java.lang.String r0 = "it"
            qc.q.i(r4, r0)
            com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment r0 = r3.this$0
            com.habitrpg.android.habitica.databinding.FragmentPartyDetailBinding r0 = r0.getBinding()
            r1 = 0
            if (r0 == 0) goto L1d
            com.habitrpg.common.habitica.views.PixelArtView r0 = r0.questImageView
            if (r0 == 0) goto L1d
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L1d
            android.graphics.drawable.Drawable$ConstantState r0 = r0.getConstantState()
            goto L1e
        L1d:
            r0 = r1
        L1e:
            android.graphics.drawable.Drawable$ConstantState r2 = r4.getConstantState()
            boolean r0 = qc.q.d(r0, r2)
            if (r0 == 0) goto L3c
            com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment r0 = r3.this$0
            com.habitrpg.android.habitica.databinding.FragmentPartyDetailBinding r0 = r0.getBinding()
            if (r0 == 0) goto L39
            com.habitrpg.common.habitica.views.PixelArtView r0 = r0.questImageView
            if (r0 == 0) goto L39
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            goto L3a
        L39:
            r0 = r1
        L3a:
            if (r0 != 0) goto L4b
        L3c:
            com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment r0 = r3.this$0
            com.habitrpg.android.habitica.databinding.FragmentPartyDetailBinding r0 = r0.getBinding()
            if (r0 == 0) goto L4b
            com.habitrpg.common.habitica.views.PixelArtView r0 = r0.questImageView
            if (r0 == 0) goto L4b
            r0.setImageDrawable(r4)
        L4b:
            com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment r0 = r3.this$0
            com.habitrpg.android.habitica.databinding.FragmentPartyDetailBinding r0 = r0.getBinding()
            if (r0 == 0) goto L5c
            com.habitrpg.common.habitica.views.PixelArtView r0 = r0.questImageView
            if (r0 == 0) goto L5c
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            goto L5d
        L5c:
            r0 = r1
        L5d:
            if (r0 != 0) goto L60
            return
        L60:
            int r4 = r4.getIntrinsicHeight()
            android.content.Context r2 = r3.$context
            int r4 = com.habitrpg.common.habitica.extensions.IntExtensionsKt.dpToPx(r4, r2)
            r0.height = r4
            com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment r4 = r3.this$0
            com.habitrpg.android.habitica.databinding.FragmentPartyDetailBinding r4 = r4.getBinding()
            if (r4 == 0) goto L76
            com.habitrpg.common.habitica.views.PixelArtView r1 = r4.questImageView
        L76:
            if (r1 != 0) goto L79
            goto L7c
        L79:
            r1.setLayoutParams(r0)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment$updateQuestContent$1$1.invoke2(android.graphics.drawable.Drawable):void");
    }
}
