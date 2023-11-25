package com.habitrpg.android.habitica.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.databinding.ActivityNotificationsBinding;
import com.habitrpg.android.habitica.extensions.BaseViewModelExtensionsKt;
import com.habitrpg.android.habitica.extensions.ViewExtKt;
import com.habitrpg.android.habitica.helpers.HapticFeedbackManager;
import com.habitrpg.android.habitica.models.inventory.QuestBoss;
import com.habitrpg.android.habitica.models.inventory.QuestCollect;
import com.habitrpg.android.habitica.models.inventory.QuestContent;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel;
import com.habitrpg.common.habitica.extensions.DataBindingUtilsKt;
import com.habitrpg.common.habitica.extensions.StringExtensionsKt;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.models.Notification;
import com.habitrpg.common.habitica.models.notifications.GroupTaskApprovedData;
import com.habitrpg.common.habitica.models.notifications.GroupTaskNeedsWorkData;
import com.habitrpg.common.habitica.models.notifications.GroupTaskRequiresApprovalData;
import com.habitrpg.common.habitica.models.notifications.ItemReceivedData;
import com.habitrpg.common.habitica.models.notifications.NewChatMessageData;
import com.habitrpg.common.habitica.models.notifications.NotificationData;
import com.habitrpg.common.habitica.models.notifications.NotificationGroup;
import com.habitrpg.common.habitica.models.notifications.QuestInvitationData;
import com.habitrpg.common.habitica.models.notifications.UnallocatedPointsData;
import com.habitrpg.common.habitica.views.PixelArtView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: NotificationsActivity.kt */
/* loaded from: classes4.dex */
public final class NotificationsActivity extends Hilt_NotificationsActivity implements SwipeRefreshLayout.j {
    public static final int $stable = 8;
    private ActivityNotificationsBinding binding;
    private LayoutInflater inflater;
    public InventoryRepository inventoryRepository;
    private List<Notification> notifications;
    public SocialRepository socialRepository;
    private Integer userLvl;
    private final dc.f viewModel$delegate = new androidx.lifecycle.x0(qc.g0.b(NotificationsViewModel.class), new NotificationsActivity$special$$inlined$viewModels$default$2(this), new NotificationsActivity$special$$inlined$viewModels$default$1(this), new NotificationsActivity$special$$inlined$viewModels$default$3(null, this));

    public NotificationsActivity() {
        List<Notification> i10;
        i10 = ec.t.i();
        this.notifications = i10;
    }

    private final String convertGroupMessageHtml(String str) {
        return new yc.j("(?<=</?)span").g(str, Task.FILTER_STRONG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View createActionableNotificationItem(final Notification notification, CharSequence charSequence, boolean z10, final String str) {
        View view;
        Button button;
        Button button2;
        TextView textView;
        View view2;
        LayoutInflater layoutInflater = this.inflater;
        TextView textView2 = null;
        if (layoutInflater != null) {
            ActivityNotificationsBinding activityNotificationsBinding = this.binding;
            if (activityNotificationsBinding == null) {
                qc.q.z("binding");
                activityNotificationsBinding = null;
            }
            view = layoutInflater.inflate(R.layout.notification_item_actionable, (ViewGroup) activityNotificationsBinding.notificationItems, false);
        } else {
            view = null;
        }
        if (z10) {
            if (view != null) {
                view2 = view.findViewById(R.id.notification_item);
            } else {
                view2 = null;
            }
            if (!(view2 instanceof View)) {
                view2 = null;
            }
            if (view2 != null) {
                view2.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.v1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        NotificationsActivity.createActionableNotificationItem$lambda$10(str, notification, this, view3);
                    }
                });
            }
        }
        if (view != null) {
            button = (Button) view.findViewById(R.id.accept_button);
        } else {
            button = null;
        }
        if (!(button instanceof Button)) {
            button = null;
        }
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.w1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    NotificationsActivity.createActionableNotificationItem$lambda$11(NotificationsActivity.this, notification, view3);
                }
            });
        }
        if (view != null) {
            button2 = (Button) view.findViewById(R.id.reject_button);
        } else {
            button2 = null;
        }
        if (!(button2 instanceof Button)) {
            button2 = null;
        }
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.x1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    NotificationsActivity.createActionableNotificationItem$lambda$12(NotificationsActivity.this, notification, view3);
                }
            });
        }
        if (view != null) {
            textView = (TextView) view.findViewById(R.id.message_text);
        } else {
            textView = null;
        }
        if (textView instanceof TextView) {
            textView2 = textView;
        }
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        return view;
    }

    static /* synthetic */ View createActionableNotificationItem$default(NotificationsActivity notificationsActivity, Notification notification, CharSequence charSequence, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            str = null;
        }
        return notificationsActivity.createActionableNotificationItem(notification, charSequence, z10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createActionableNotificationItem$lambda$10(String str, Notification notification, NotificationsActivity notificationsActivity, View view) {
        qc.q.i(notification, "$notification");
        qc.q.i(notificationsActivity, "this$0");
        qc.q.f(view);
        ViewExtKt.flash(view);
        HapticFeedbackManager.Companion.tap(view);
        if (str != null) {
            FullProfileActivity.Companion.open(str);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("notificationId", notification.getId());
        notificationsActivity.setResult(-1, intent);
        notificationsActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createActionableNotificationItem$lambda$11(NotificationsActivity notificationsActivity, Notification notification, View view) {
        qc.q.i(notificationsActivity, "this$0");
        qc.q.i(notification, "$notification");
        ActivityNotificationsBinding activityNotificationsBinding = notificationsActivity.binding;
        if (activityNotificationsBinding == null) {
            qc.q.z("binding");
            activityNotificationsBinding = null;
        }
        LinearLayout root = activityNotificationsBinding.getRoot();
        qc.q.h(root, "getRoot(...)");
        ViewExtKt.flash(root);
        HapticFeedbackManager.Companion companion = HapticFeedbackManager.Companion;
        qc.q.f(view);
        companion.tap(view);
        notificationsActivity.removeNotificationAndRefresh(notification);
        notificationsActivity.getViewModel().accept(notification.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createActionableNotificationItem$lambda$12(NotificationsActivity notificationsActivity, Notification notification, View view) {
        qc.q.i(notificationsActivity, "this$0");
        qc.q.i(notification, "$notification");
        ActivityNotificationsBinding activityNotificationsBinding = notificationsActivity.binding;
        if (activityNotificationsBinding == null) {
            qc.q.z("binding");
            activityNotificationsBinding = null;
        }
        LinearLayout root = activityNotificationsBinding.getRoot();
        qc.q.h(root, "getRoot(...)");
        ViewExtKt.flash(root);
        HapticFeedbackManager.Companion companion = HapticFeedbackManager.Companion;
        qc.q.f(view);
        companion.tap(view);
        notificationsActivity.removeNotificationAndRefresh(notification);
        notificationsActivity.getViewModel().reject(notification.getId());
    }

    private final View createDismissableNotificationItem(final Notification notification, CharSequence charSequence, Integer num, String str, Integer num2) {
        View view;
        final View view2;
        ImageView imageView;
        TextView textView;
        PixelArtView pixelArtView;
        ImageView imageView2;
        LayoutInflater layoutInflater = this.inflater;
        if (layoutInflater != null) {
            ActivityNotificationsBinding activityNotificationsBinding = this.binding;
            if (activityNotificationsBinding == null) {
                qc.q.z("binding");
                activityNotificationsBinding = null;
            }
            view = layoutInflater.inflate(R.layout.notification_item, (ViewGroup) activityNotificationsBinding.notificationItems, false);
        } else {
            view = null;
        }
        if (view != null) {
            view2 = view.findViewById(R.id.notification_item);
        } else {
            view2 = null;
        }
        if (!(view2 instanceof View)) {
            view2 = null;
        }
        if (view2 != null) {
            view2.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.s1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    NotificationsActivity.createDismissableNotificationItem$lambda$7(Notification.this, this, view3);
                }
            });
        }
        if (view != null) {
            imageView = (ImageView) view.findViewById(R.id.dismiss_button);
        } else {
            imageView = null;
        }
        if (!(imageView instanceof ImageView)) {
            imageView = null;
        }
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.t1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    NotificationsActivity.createDismissableNotificationItem$lambda$8(view2, this, notification, view3);
                }
            });
        }
        if (view != null) {
            textView = (TextView) view.findViewById(R.id.message_text);
        } else {
            textView = null;
        }
        if (!(textView instanceof TextView)) {
            textView = null;
        }
        if (textView != null) {
            textView.setText(charSequence);
        }
        if (num != null) {
            if (view != null) {
                imageView2 = (ImageView) view.findViewById(R.id.notification_image);
            } else {
                imageView2 = null;
            }
            if (!(imageView2 instanceof ImageView)) {
                imageView2 = null;
            }
            if (imageView2 != null) {
                imageView2.setImageResource(num.intValue());
            }
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
        }
        if (str != null) {
            if (view != null) {
                pixelArtView = (PixelArtView) view.findViewById(R.id.notification_image);
            } else {
                pixelArtView = null;
            }
            if (!(pixelArtView instanceof PixelArtView)) {
                pixelArtView = null;
            }
            if (pixelArtView != null) {
                DataBindingUtilsKt.loadImage$default(pixelArtView, str, null, 2, null);
            }
            if (pixelArtView != null) {
                pixelArtView.setVisibility(0);
            }
        }
        if (num2 != null && textView != null) {
            textView.setTextColor(androidx.core.content.a.c(this, num2.intValue()));
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ View createDismissableNotificationItem$default(NotificationsActivity notificationsActivity, Notification notification, CharSequence charSequence, Integer num, String str, Integer num2, int i10, Object obj) {
        Integer num3;
        String str2;
        Integer num4;
        if ((i10 & 4) != 0) {
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i10 & 16) != 0) {
            num4 = null;
        } else {
            num4 = num2;
        }
        return notificationsActivity.createDismissableNotificationItem(notification, charSequence, num3, str2, num4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createDismissableNotificationItem$lambda$7(Notification notification, NotificationsActivity notificationsActivity, View view) {
        qc.q.i(notification, "$notification");
        qc.q.i(notificationsActivity, "this$0");
        qc.q.f(view);
        ViewExtKt.flash(view);
        HapticFeedbackManager.Companion.tap(view);
        Intent intent = new Intent();
        intent.putExtra("notificationId", notification.getId());
        notificationsActivity.setResult(-1, intent);
        notificationsActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createDismissableNotificationItem$lambda$8(View view, NotificationsActivity notificationsActivity, Notification notification, View view2) {
        qc.q.i(notificationsActivity, "this$0");
        qc.q.i(notification, "$notification");
        if (view != null) {
            ViewExtKt.flash(view);
        }
        HapticFeedbackManager.Companion companion = HapticFeedbackManager.Companion;
        qc.q.f(view2);
        companion.tap(view2);
        notificationsActivity.removeNotificationAndRefresh(notification);
        notificationsActivity.getViewModel().dismissNotification(notification);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View createGroupTaskApprovedNotification(Notification notification) {
        GroupTaskApprovedData groupTaskApprovedData;
        String str;
        NotificationData data = notification.getData();
        if (data instanceof GroupTaskApprovedData) {
            groupTaskApprovedData = (GroupTaskApprovedData) data;
        } else {
            groupTaskApprovedData = null;
        }
        if (groupTaskApprovedData == null || (str = groupTaskApprovedData.getMessage()) == null) {
            str = "";
        }
        return createDismissableNotificationItem$default(this, notification, fromHtml(convertGroupMessageHtml(str)), null, null, Integer.valueOf((int) R.color.green_10), 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View createGroupTaskNeedsApprovalNotification(Notification notification) {
        GroupTaskRequiresApprovalData groupTaskRequiresApprovalData;
        String str;
        NotificationData data = notification.getData();
        if (data instanceof GroupTaskRequiresApprovalData) {
            groupTaskRequiresApprovalData = (GroupTaskRequiresApprovalData) data;
        } else {
            groupTaskRequiresApprovalData = null;
        }
        if (groupTaskRequiresApprovalData == null || (str = groupTaskRequiresApprovalData.getMessage()) == null) {
            str = "";
        }
        View createActionableNotificationItem$default = createActionableNotificationItem$default(this, notification, fromHtml(convertGroupMessageHtml(str)), false, null, 12, null);
        if (createActionableNotificationItem$default != null) {
            createActionableNotificationItem$default.setVisibility(8);
        }
        return createActionableNotificationItem$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View createGroupTaskNeedsWorkNotification(Notification notification) {
        GroupTaskNeedsWorkData groupTaskNeedsWorkData;
        String str;
        NotificationData data = notification.getData();
        if (data instanceof GroupTaskNeedsWorkData) {
            groupTaskNeedsWorkData = (GroupTaskNeedsWorkData) data;
        } else {
            groupTaskNeedsWorkData = null;
        }
        if (groupTaskNeedsWorkData == null || (str = groupTaskNeedsWorkData.getMessage()) == null) {
            str = "";
        }
        return createDismissableNotificationItem$default(this, notification, fromHtml(convertGroupMessageHtml(str)), null, null, Integer.valueOf((int) R.color.yellow_5), 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View createItemReceivedNotification(Notification notification) {
        ItemReceivedData itemReceivedData;
        String str;
        String str2;
        NotificationData data = notification.getData();
        String str3 = null;
        if (data instanceof ItemReceivedData) {
            itemReceivedData = (ItemReceivedData) data;
        } else {
            itemReceivedData = null;
        }
        if (itemReceivedData != null) {
            str = itemReceivedData.getTitle();
        } else {
            str = null;
        }
        if (itemReceivedData != null) {
            str2 = itemReceivedData.getText();
        } else {
            str2 = null;
        }
        CharSequence fromHtml = fromHtml("<b>" + str + "</b><br>" + str2);
        if (itemReceivedData != null) {
            str3 = itemReceivedData.getIcon();
        }
        return createDismissableNotificationItem$default(this, notification, fromHtml, null, str3, null, 20, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View createMysteryItemsNotification(Notification notification) {
        String string = getString(R.string.new_subscriber_item);
        qc.q.h(string, "getString(...)");
        return createDismissableNotificationItem$default(this, notification, fromHtml(string), Integer.valueOf((int) R.drawable.notification_mystery_item), null, null, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View createNewChatMessageNotification(Notification notification) {
        NewChatMessageData newChatMessageData;
        int i10;
        NotificationGroup group;
        NotificationData data = notification.getData();
        String str = null;
        if (data instanceof NewChatMessageData) {
            newChatMessageData = (NewChatMessageData) data;
        } else {
            newChatMessageData = null;
        }
        if (getViewModel().isPartyMessage(newChatMessageData)) {
            i10 = R.string.new_msg_party;
        } else {
            i10 = R.string.new_msg_guild;
        }
        Object[] objArr = new Object[1];
        if (newChatMessageData != null && (group = newChatMessageData.getGroup()) != null) {
            str = group.getName();
        }
        objArr[0] = str;
        String string = getString(i10, objArr);
        qc.q.h(string, "getString(...)");
        return createDismissableNotificationItem$default(this, notification, fromHtml(string), null, null, null, 28, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object createNewStuffNotification(Notification notification, Continuation<? super View> continuation) {
        return ad.g.g(ad.a1.b(), new NotificationsActivity$createNewStuffNotification$2(notification, this, null), continuation);
    }

    private final View createNotificationsHeaderView(int i10) {
        View view;
        TextView textView;
        Button button;
        LayoutInflater layoutInflater = this.inflater;
        Button button2 = null;
        if (layoutInflater != null) {
            ActivityNotificationsBinding activityNotificationsBinding = this.binding;
            if (activityNotificationsBinding == null) {
                qc.q.z("binding");
                activityNotificationsBinding = null;
            }
            view = layoutInflater.inflate(R.layout.notifications_header, (ViewGroup) activityNotificationsBinding.notificationItems, false);
        } else {
            view = null;
        }
        if (view != null) {
            textView = (TextView) view.findViewById(R.id.notifications_title_badge);
        } else {
            textView = null;
        }
        if (!(textView instanceof TextView)) {
            textView = null;
        }
        if (textView != null) {
            textView.setText(String.valueOf(i10));
        }
        if (view != null) {
            button = (Button) view.findViewById(R.id.dismiss_all_button);
        } else {
            button = null;
        }
        if (button instanceof Button) {
            button2 = button;
        }
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.u1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    NotificationsActivity.createNotificationsHeaderView$lambda$6(NotificationsActivity.this, view2);
                }
            });
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createNotificationsHeaderView$lambda$6(NotificationsActivity notificationsActivity, View view) {
        qc.q.i(notificationsActivity, "this$0");
        ActivityNotificationsBinding activityNotificationsBinding = notificationsActivity.binding;
        if (activityNotificationsBinding == null) {
            qc.q.z("binding");
            activityNotificationsBinding = null;
        }
        LinearLayout root = activityNotificationsBinding.getRoot();
        qc.q.h(root, "getRoot(...)");
        ViewExtKt.flash(root);
        HapticFeedbackManager.Companion companion = HapticFeedbackManager.Companion;
        qc.q.f(view);
        companion.tap(view);
        notificationsActivity.getViewModel().dismissAllNotifications(notificationsActivity.notifications);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object createPartyInvitationNotification(Notification notification, Continuation<? super View> continuation) {
        return ad.g.g(ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), new NotificationsActivity$createPartyInvitationNotification$2(notification, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View createQuestInvitationNotification(Notification notification) {
        QuestInvitationData questInvitationData;
        NotificationData data = notification.getData();
        if (data instanceof QuestInvitationData) {
            questInvitationData = (QuestInvitationData) data;
        } else {
            questInvitationData = null;
        }
        View createActionableNotificationItem$default = createActionableNotificationItem$default(this, notification, "", true, null, 8, null);
        if (createActionableNotificationItem$default != null) {
            createActionableNotificationItem$default.setVisibility(8);
        }
        ad.i.d(androidx.lifecycle.w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new NotificationsActivity$createQuestInvitationNotification$1(this, questInvitationData, createActionableNotificationItem$default, null), 2, null);
        return createActionableNotificationItem$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View createUnallocatedStatsNotification(Notification notification) {
        UnallocatedPointsData unallocatedPointsData;
        Integer num = this.userLvl;
        Integer num2 = null;
        if (num == null || num.intValue() < 10) {
            return null;
        }
        NotificationData data = notification.getData();
        if (data instanceof UnallocatedPointsData) {
            unallocatedPointsData = (UnallocatedPointsData) data;
        } else {
            unallocatedPointsData = null;
        }
        Object[] objArr = new Object[1];
        if (unallocatedPointsData != null) {
            num2 = unallocatedPointsData.getPoints();
        }
        objArr[0] = String.valueOf(num2);
        String string = getString(R.string.unallocated_stats_points, objArr);
        qc.q.h(string, "getString(...)");
        return createDismissableNotificationItem$default(this, notification, fromHtml(string), Integer.valueOf((int) R.drawable.notification_stat_sparkles), null, null, 24, null);
    }

    private final void displayNoNotificationsView() {
        ActivityNotificationsBinding activityNotificationsBinding = this.binding;
        View view = null;
        ActivityNotificationsBinding activityNotificationsBinding2 = null;
        if (activityNotificationsBinding == null) {
            qc.q.z("binding");
            activityNotificationsBinding = null;
        }
        activityNotificationsBinding.notificationItems.removeAllViewsInLayout();
        ActivityNotificationsBinding activityNotificationsBinding3 = this.binding;
        if (activityNotificationsBinding3 == null) {
            qc.q.z("binding");
            activityNotificationsBinding3 = null;
        }
        activityNotificationsBinding3.notificationItems.setShowDividers(0);
        ActivityNotificationsBinding activityNotificationsBinding4 = this.binding;
        if (activityNotificationsBinding4 == null) {
            qc.q.z("binding");
            activityNotificationsBinding4 = null;
        }
        LinearLayout linearLayout = activityNotificationsBinding4.notificationItems;
        LayoutInflater layoutInflater = this.inflater;
        if (layoutInflater != null) {
            ActivityNotificationsBinding activityNotificationsBinding5 = this.binding;
            if (activityNotificationsBinding5 == null) {
                qc.q.z("binding");
            } else {
                activityNotificationsBinding2 = activityNotificationsBinding5;
            }
            view = layoutInflater.inflate(R.layout.no_notifications, (ViewGroup) activityNotificationsBinding2.notificationItems, false);
        }
        linearLayout.addView(view);
    }

    private final void displayNotificationsListView(List<Notification> list) {
        ActivityNotificationsBinding activityNotificationsBinding = this.binding;
        if (activityNotificationsBinding == null) {
            qc.q.z("binding");
            activityNotificationsBinding = null;
        }
        activityNotificationsBinding.notificationItems.setShowDividers(6);
        ArrayList arrayList = new ArrayList();
        View createNotificationsHeaderView = createNotificationsHeaderView(list.size());
        if (createNotificationsHeaderView != null) {
            arrayList.add(createNotificationsHeaderView);
        }
        ad.i.d(androidx.lifecycle.w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new NotificationsActivity$displayNotificationsListView$2(list, this, arrayList, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CharSequence fromHtml(String str) {
        return StringExtensionsKt.fromHtml(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(NotificationsActivity notificationsActivity, User user) {
        int i10;
        Stats stats;
        qc.q.i(notificationsActivity, "this$0");
        if (user == null || (stats = user.getStats()) == null || (i10 = stats.getLvl()) == null) {
            i10 = 0;
        }
        notificationsActivity.userLvl = i10;
    }

    private final void removeNotificationAndRefresh(Notification notification) {
        List<Notification> list = this.notifications;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if ((!qc.q.d(((Notification) obj).getId(), notification.getId())) != false) {
                arrayList.add(obj);
            }
        }
        this.notifications = arrayList;
        if (arrayList.isEmpty()) {
            displayNoNotificationsView();
        } else {
            displayNotificationsListView(this.notifications);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setNotifications(List<Notification> list) {
        this.notifications = list;
        if (list.isEmpty()) {
            displayNoNotificationsView();
        } else {
            displayNotificationsListView(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateNotificationsAndRefresh(List<? extends View> list) {
        vc.f s10;
        int s11;
        List<View> q02;
        List<View> q03;
        ActivityNotificationsBinding activityNotificationsBinding = this.binding;
        if (activityNotificationsBinding == null) {
            qc.q.z("binding");
            activityNotificationsBinding = null;
        }
        s10 = vc.l.s(0, activityNotificationsBinding.notificationItems.getChildCount());
        s11 = ec.u.s(s10, 10);
        ArrayList arrayList = new ArrayList(s11);
        Iterator<Integer> it = s10.iterator();
        while (it.hasNext()) {
            int a10 = ((ec.h0) it).a();
            ActivityNotificationsBinding activityNotificationsBinding2 = this.binding;
            if (activityNotificationsBinding2 == null) {
                qc.q.z("binding");
                activityNotificationsBinding2 = null;
            }
            arrayList.add(activityNotificationsBinding2.notificationItems.getChildAt(a10));
        }
        List<? extends View> list2 = list;
        q02 = ec.b0.q0(arrayList, list2);
        for (View view : q02) {
            ActivityNotificationsBinding activityNotificationsBinding3 = this.binding;
            if (activityNotificationsBinding3 == null) {
                qc.q.z("binding");
                activityNotificationsBinding3 = null;
            }
            activityNotificationsBinding3.notificationItems.removeView(view);
        }
        q03 = ec.b0.q0(list2, arrayList);
        for (View view2 : q03) {
            ActivityNotificationsBinding activityNotificationsBinding4 = this.binding;
            if (activityNotificationsBinding4 == null) {
                qc.q.z("binding");
                activityNotificationsBinding4 = null;
            }
            activityNotificationsBinding4.notificationItems.addView(view2);
        }
        ad.i.d(androidx.lifecycle.w.a(this), null, null, new NotificationsActivity$updateNotificationsAndRefresh$3(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateQuestInvitationView(View view, QuestContent questContent) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        RatingBar ratingBar;
        ArrayList arrayList;
        String str;
        int s10;
        View view2;
        String str2;
        View view3 = null;
        if (view != null) {
            textView = (TextView) view.findViewById(R.id.message_text);
        } else {
            textView = null;
        }
        if (!(textView instanceof TextView)) {
            textView = null;
        }
        if (textView != null) {
            String string = getString(R.string.invited_to_quest, questContent.getText());
            qc.q.h(string, "getString(...)");
            textView.setText(fromHtml(string));
        }
        if (view != null) {
            textView2 = (TextView) view.findViewById(R.id.quest_objective_label);
        } else {
            textView2 = null;
        }
        if (!(textView2 instanceof TextView)) {
            textView2 = null;
        }
        if (view != null) {
            textView3 = (TextView) view.findViewById(R.id.quest_objective_text);
        } else {
            textView3 = null;
        }
        if (!(textView3 instanceof TextView)) {
            textView3 = null;
        }
        if (view != null) {
            textView4 = (TextView) view.findViewById(R.id.difficulty_label);
        } else {
            textView4 = null;
        }
        if (!(textView4 instanceof TextView)) {
            textView4 = null;
        }
        if (textView4 != null) {
            textView4.setText(getText(R.string.difficulty));
        }
        if (textView4 != null) {
            textView4.append(":");
        }
        if (view != null) {
            ratingBar = (RatingBar) view.findViewById(R.id.quest_difficulty);
        } else {
            ratingBar = null;
        }
        if (!(ratingBar instanceof RatingBar)) {
            ratingBar = null;
        }
        float f10 = 1.0f;
        if (questContent.isBossQuest()) {
            if (textView2 != null) {
                textView2.setText(getString(R.string.defeat));
            }
            if (textView3 != null) {
                QuestBoss boss = questContent.getBoss();
                if (boss != null) {
                    str2 = boss.getName();
                } else {
                    str2 = null;
                }
                textView3.setText(str2);
            }
            if (ratingBar != null) {
                QuestBoss boss2 = questContent.getBoss();
                if (boss2 != null) {
                    f10 = boss2.getStr();
                }
                ratingBar.setRating(f10);
            }
        } else {
            if (textView2 != null) {
                textView2.setText(getString(R.string.collect));
            }
            io.realm.x0<QuestCollect> collect = questContent.getCollect();
            if (collect != null) {
                s10 = ec.u.s(collect, 10);
                ArrayList arrayList2 = new ArrayList(s10);
                for (QuestCollect questCollect : collect) {
                    arrayList2.add(questCollect.getCount() + " " + questCollect.getText());
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            if (textView3 != null) {
                if (arrayList != null) {
                    str = ec.b0.k0(arrayList, ", ", null, null, 0, null, null, 62, null);
                } else {
                    str = null;
                }
                textView3.setText(str);
            }
            if (ratingBar != null) {
                ratingBar.setRating(1.0f);
            }
        }
        if (textView2 != null) {
            textView2.append(":");
        }
        if (view != null) {
            view2 = view.findViewById(R.id.quest_detail_view);
        } else {
            view2 = null;
        }
        if (view2 instanceof View) {
            view3 = view2;
        }
        if (view3 != null) {
            view3.setVisibility(0);
        }
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    public View getContentView(Integer num) {
        ActivityNotificationsBinding inflate = ActivityNotificationsBinding.inflate(getLayoutInflater());
        qc.q.h(inflate, "inflate(...)");
        this.binding = inflate;
        if (inflate == null) {
            qc.q.z("binding");
            inflate = null;
        }
        LinearLayout root = inflate.getRoot();
        qc.q.h(root, "getRoot(...)");
        return root;
    }

    public final LayoutInflater getInflater() {
        return this.inflater;
    }

    public final InventoryRepository getInventoryRepository() {
        InventoryRepository inventoryRepository = this.inventoryRepository;
        if (inventoryRepository != null) {
            return inventoryRepository;
        }
        qc.q.z("inventoryRepository");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    protected Integer getLayoutResId() {
        return Integer.valueOf((int) R.layout.activity_notifications);
    }

    public final SocialRepository getSocialRepository() {
        SocialRepository socialRepository = this.socialRepository;
        if (socialRepository != null) {
            return socialRepository;
        }
        qc.q.z("socialRepository");
        return null;
    }

    public final Integer getUserLvl() {
        return this.userLvl;
    }

    public final NotificationsViewModel getViewModel() {
        return (NotificationsViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.fragment.app.q, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        LayoutInflater layoutInflater;
        super.onCreate(bundle);
        ActivityNotificationsBinding activityNotificationsBinding = this.binding;
        if (activityNotificationsBinding == null) {
            qc.q.z("binding");
            activityNotificationsBinding = null;
        }
        setupToolbar(activityNotificationsBinding.toolbar);
        BaseViewModelExtensionsKt.observeOnce(getViewModel().getUser(), this, new androidx.lifecycle.g0() { // from class: com.habitrpg.android.habitica.ui.activities.y1
            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                NotificationsActivity.onCreate$lambda$0(NotificationsActivity.this, (User) obj);
            }
        });
        Object systemService = getSystemService("layout_inflater");
        if (systemService instanceof LayoutInflater) {
            layoutInflater = (LayoutInflater) systemService;
        } else {
            layoutInflater = null;
        }
        this.inflater = layoutInflater;
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new NotificationsActivity$onCreate$2(this, null), 1, null);
        ActivityNotificationsBinding activityNotificationsBinding2 = this.binding;
        if (activityNotificationsBinding2 == null) {
            qc.q.z("binding");
            activityNotificationsBinding2 = null;
        }
        activityNotificationsBinding2.notificationsRefreshLayout.setOnRefreshListener(this);
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new NotificationsActivity$onCreate$3(this, null), 1, null);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
    public void onRefresh() {
        ActivityNotificationsBinding activityNotificationsBinding = this.binding;
        if (activityNotificationsBinding == null) {
            qc.q.z("binding");
            activityNotificationsBinding = null;
        }
        activityNotificationsBinding.notificationsRefreshLayout.setRefreshing(true);
        ad.i.d(androidx.lifecycle.w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new NotificationsActivity$onRefresh$1(this, null), 2, null);
    }

    @Override // androidx.appcompat.app.d
    public boolean onSupportNavigateUp() {
        if (getSupportFragmentManager().r0() > 0) {
            onBackPressed();
            return true;
        }
        return super.onSupportNavigateUp();
    }

    public final void setInflater(LayoutInflater layoutInflater) {
        this.inflater = layoutInflater;
    }

    public final void setInventoryRepository(InventoryRepository inventoryRepository) {
        qc.q.i(inventoryRepository, "<set-?>");
        this.inventoryRepository = inventoryRepository;
    }

    public final void setSocialRepository(SocialRepository socialRepository) {
        qc.q.i(socialRepository, "<set-?>");
        this.socialRepository = socialRepository;
    }

    public final void setUserLvl(Integer num) {
        this.userLvl = num;
    }
}
