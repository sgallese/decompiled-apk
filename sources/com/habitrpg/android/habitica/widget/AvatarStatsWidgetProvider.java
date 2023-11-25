package com.habitrpg.android.habitica.widget;

import ad.i;
import ad.l0;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.common.habitica.extensions.IntExtensionsKt;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.views.AvatarView;
import java.util.LinkedHashMap;
import java.util.Map;
import qc.q;

/* compiled from: AvatarStatsWidgetProvider.kt */
/* loaded from: classes4.dex */
public final class AvatarStatsWidgetProvider extends Hilt_AvatarStatsWidgetProvider {
    public static final int $stable = 8;
    private AppWidgetManager appWidgetManager;
    private AvatarView avatarView;
    private User user;
    private Map<Integer, Boolean> showManaBar = new LinkedHashMap();
    private Map<Integer, Boolean> showAvatar = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0284  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateData(int[] r29) {
        /*
            Method dump skipped, instructions count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.widget.AvatarStatsWidgetProvider.updateData(int[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void updateData$default(AvatarStatsWidgetProvider avatarStatsWidgetProvider, int[] iArr, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iArr = null;
        }
        avatarStatsWidgetProvider.updateData(iArr);
    }

    @Override // com.habitrpg.android.habitica.widget.BaseWidgetProvider
    public RemoteViews configureRemoteViews(RemoteViews remoteViews, int i10, int i11, int i12) {
        boolean z10;
        boolean z11;
        q.i(remoteViews, "remoteViews");
        Integer valueOf = Integer.valueOf(i10);
        Map<Integer, Boolean> map = this.showAvatar;
        if (i11 > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        map.put(valueOf, Boolean.valueOf(z10));
        if (q.d(this.showAvatar.get(Integer.valueOf(i10)), Boolean.TRUE)) {
            remoteViews.setViewVisibility(R.id.avatar_view, 0);
        } else {
            remoteViews.setViewVisibility(R.id.avatar_view, 8);
        }
        Integer valueOf2 = Integer.valueOf(i10);
        Map<Integer, Boolean> map2 = this.showManaBar;
        if (i12 > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        map2.put(valueOf2, Boolean.valueOf(z11));
        if (i12 > 1) {
            remoteViews.setViewVisibility(R.id.detail_info_view, 0);
        } else {
            remoteViews.setViewVisibility(R.id.detail_info_view, 8);
        }
        return remoteViews;
    }

    @Override // com.habitrpg.android.habitica.widget.BaseWidgetProvider
    public int layoutResourceId() {
        return R.layout.widget_avatar_stats;
    }

    @Override // com.habitrpg.android.habitica.widget.BaseWidgetProvider, android.appwidget.AppWidgetProvider
    public void onEnabled(Context context) {
        q.i(context, "context");
        super.onEnabled(context);
        Context applicationContext = context.getApplicationContext();
        q.h(applicationContext, "getApplicationContext(...)");
        this.avatarView = new AvatarView(applicationContext, true, true, true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(IntExtensionsKt.dpToPx(140, context), IntExtensionsKt.dpToPx(147, context));
        AvatarView avatarView = this.avatarView;
        if (avatarView == null) {
            q.z("avatarView");
            avatarView = null;
        }
        avatarView.setLayoutParams(layoutParams);
        ExceptionHandlerKt.launchCatching$default(l0.b(), null, new AvatarStatsWidgetProvider$onEnabled$1(this, null), 1, null);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        q.i(context, "context");
        q.i(appWidgetManager, "appWidgetManager");
        q.i(iArr, "appWidgetIds");
        super.onUpdate(context, appWidgetManager, iArr);
        if (this.avatarView == null) {
            Context applicationContext = context.getApplicationContext();
            q.h(applicationContext, "getApplicationContext(...)");
            this.avatarView = new AvatarView(applicationContext, true, true, true);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(IntExtensionsKt.dpToPx(140, context), IntExtensionsKt.dpToPx(147, context));
            AvatarView avatarView = this.avatarView;
            if (avatarView == null) {
                q.z("avatarView");
                avatarView = null;
            }
            avatarView.setLayoutParams(layoutParams);
        }
        this.appWidgetManager = appWidgetManager;
        setContext(context);
        if (this.user == null) {
            i.d(l0.b(), null, null, new AvatarStatsWidgetProvider$onUpdate$1(this, iArr, null), 3, null);
        } else {
            updateData$default(this, null, 1, null);
        }
    }
}
