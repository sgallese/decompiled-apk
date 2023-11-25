package com.habitrpg.android.habitica.ui.fragments.social.party;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.models.invitations.InviteResponse;
import com.habitrpg.android.habitica.ui.activities.GroupInviteActivity;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.android.habitica.ui.viewmodels.BaseViewModel;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.common.habitica.extensions.StringExtensionsKt;
import ec.k0;
import j0.y2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import yc.v;

/* compiled from: PartyInviteFragment.kt */
/* loaded from: classes4.dex */
public final class PartyInviteViewModel extends BaseViewModel {
    public static final int $stable = 8;
    private final t0.r<String> invites;
    private final SocialRepository socialRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartyInviteViewModel(UserRepository userRepository, MainUserViewModel mainUserViewModel, SocialRepository socialRepository) {
        super(userRepository, mainUserViewModel);
        qc.q.i(userRepository, "userRepository");
        qc.q.i(mainUserViewModel, "userViewModel");
        qc.q.i(socialRepository, "socialRepository");
        this.socialRepository = socialRepository;
        this.invites = y2.f("");
    }

    public final t0.r<String> getInvites() {
        return this.invites;
    }

    public final SocialRepository getSocialRepository() {
        return this.socialRepository;
    }

    public final Object sendInvites(Continuation<? super List<InviteResponse>> continuation) {
        boolean u10;
        List list;
        Map<String, ? extends Object> k10 = k0.k(dc.r.a(GroupInviteActivity.EMAILS_KEY, new ArrayList()), dc.r.a("uuids", new ArrayList()), dc.r.a("usernames", new ArrayList()));
        Iterator<String> it = this.invites.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (StringExtensionsKt.isValidEmail(next)) {
                List list2 = (List) k10.get(GroupInviteActivity.EMAILS_KEY);
                if (list2 != null) {
                    kotlin.coroutines.jvm.internal.b.a(list2.add(k0.k(dc.r.a(AppMeasurementSdk.ConditionalUserProperty.NAME, ""), dc.r.a(Scopes.EMAIL, next))));
                }
            } else if (PartyInviteFragmentKt.uUIDFromStringOrNull(next) == null) {
                u10 = v.u(next);
                if ((!u10) != false && (list = (List) k10.get("usernames")) != null) {
                    kotlin.coroutines.jvm.internal.b.a(list.add(next));
                }
            } else {
                List list3 = (List) k10.get("uuids");
                if (list3 != null) {
                    kotlin.coroutines.jvm.internal.b.a(list3.add(next));
                }
            }
        }
        return this.socialRepository.inviteToGroup(NavigationDrawerFragment.SIDEBAR_PARTY, k10, continuation);
    }
}
