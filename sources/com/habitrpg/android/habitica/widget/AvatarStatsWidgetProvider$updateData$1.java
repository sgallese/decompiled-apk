package com.habitrpg.android.habitica.widget;

import android.appwidget.AppWidgetManager;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.habitrpg.android.habitica.R;
import dc.w;
import pc.l;
import qc.r;

/* compiled from: AvatarStatsWidgetProvider.kt */
/* loaded from: classes4.dex */
final class AvatarStatsWidgetProvider$updateData$1 extends r implements l<Bitmap, w> {
    final /* synthetic */ AppWidgetManager $appWidgetManager;
    final /* synthetic */ RemoteViews $finalRemoteViews;
    final /* synthetic */ int $widgetId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarStatsWidgetProvider$updateData$1(RemoteViews remoteViews, AppWidgetManager appWidgetManager, int i10) {
        super(1);
        this.$finalRemoteViews = remoteViews;
        this.$appWidgetManager = appWidgetManager;
        this.$widgetId = i10;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Bitmap bitmap) {
        this.$finalRemoteViews.setImageViewBitmap(R.id.avatar_view, bitmap);
        this.$appWidgetManager.partiallyUpdateAppWidget(this.$widgetId, this.$finalRemoteViews);
    }
}
