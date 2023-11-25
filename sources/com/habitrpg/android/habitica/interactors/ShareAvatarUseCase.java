package com.habitrpg.android.habitica.interactors;

import com.habitrpg.android.habitica.interactors.UseCase;
import com.habitrpg.android.habitica.ui.activities.BaseActivity;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.common.habitica.views.AvatarView;
import com.habitrpg.shared.habitica.models.Avatar;
import dc.w;
import kotlin.coroutines.Continuation;
import qc.f0;
import qc.q;

/* compiled from: ShareAvatarUseCase.kt */
/* loaded from: classes4.dex */
public final class ShareAvatarUseCase extends UseCase<RequestValues, w> {
    public static final int $stable = 0;

    /* compiled from: ShareAvatarUseCase.kt */
    /* loaded from: classes4.dex */
    public static final class RequestValues implements UseCase.RequestValues {
        public static final int $stable = 8;
        private final BaseActivity activity;
        private final Avatar avatar;
        private final String identifier;
        private final String message;

        public RequestValues(BaseActivity baseActivity, Avatar avatar, String str, String str2) {
            q.i(baseActivity, "activity");
            q.i(avatar, NavigationDrawerFragment.SIDEBAR_AVATAR);
            q.i(str2, "identifier");
            this.activity = baseActivity;
            this.avatar = avatar;
            this.message = str;
            this.identifier = str2;
        }

        public final BaseActivity getActivity() {
            return this.activity;
        }

        public final Avatar getAvatar() {
            return this.avatar;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        public final String getMessage() {
            return this.message;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.interactors.UseCase
    public Object run(RequestValues requestValues, Continuation<? super w> continuation) {
        AvatarView avatarView = new AvatarView(requestValues.getActivity(), true, true, true);
        AvatarView.setAvatar$default(avatarView, requestValues.getAvatar(), null, 2, null);
        avatarView.onAvatarImageReady(new ShareAvatarUseCase$run$2(new f0(), requestValues));
        return w.f13270a;
    }
}
