package com.google.android.play.core.assetpacks;

import com.google.android.play.core.tasks.zzj;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public class AssetPackException extends zzj {

    /* renamed from: f  reason: collision with root package name */
    private final int f10701f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AssetPackException(int i10) {
        super(String.format("Asset Pack Download Error(%d): %s", Integer.valueOf(i10), v7.a.a(i10)));
        if (i10 != 0) {
            this.f10701f = i10;
            return;
        }
        throw new IllegalArgumentException("errorCode should not be 0.");
    }
}
