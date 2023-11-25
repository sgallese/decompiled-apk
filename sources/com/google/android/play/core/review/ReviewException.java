package com.google.android.play.core.review;

import com.google.android.play.core.tasks.zzj;
import java.util.Locale;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public class ReviewException extends zzj {

    /* renamed from: f  reason: collision with root package name */
    private final int f11123f;

    public ReviewException(int i10) {
        super(String.format(Locale.getDefault(), "Review Error(%d): %s", Integer.valueOf(i10), a8.a.a(i10)));
        this.f11123f = i10;
    }
}
