package com.habitrpg.android.habitica.interactors;

import android.graphics.Bitmap;
import com.habitrpg.android.habitica.interactors.ShareAvatarUseCase;
import dc.w;
import pc.l;
import qc.f0;
import qc.r;

/* compiled from: ShareAvatarUseCase.kt */
/* loaded from: classes4.dex */
final class ShareAvatarUseCase$run$2 extends r implements l<Bitmap, w> {
    final /* synthetic */ ShareAvatarUseCase.RequestValues $requestValues;
    final /* synthetic */ f0<Bitmap> $sharedImage;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareAvatarUseCase$run$2(f0<Bitmap> f0Var, ShareAvatarUseCase.RequestValues requestValues) {
        super(1);
        this.$sharedImage = f0Var;
        this.$requestValues = requestValues;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return w.f13270a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Bitmap bitmap) {
        this.$sharedImage.f21676f = bitmap != null ? Bitmap.createScaledBitmap(bitmap, bitmap.getWidth() * 3, bitmap.getHeight() * 3, false) : 0;
        this.$requestValues.getActivity().shareContent(this.$requestValues.getIdentifier(), this.$requestValues.getMessage(), this.$sharedImage.f21676f);
    }
}
