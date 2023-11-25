package com.habitrpg.android.habitica.ui.fragments;

import com.habitrpg.android.habitica.data.SocialRepository;

/* loaded from: classes4.dex */
public final class ReportBottomSheetFragment_MembersInjector implements qa.a<ReportBottomSheetFragment> {
    private final cc.a<SocialRepository> socialRepositoryProvider;

    public ReportBottomSheetFragment_MembersInjector(cc.a<SocialRepository> aVar) {
        this.socialRepositoryProvider = aVar;
    }

    public static qa.a<ReportBottomSheetFragment> create(cc.a<SocialRepository> aVar) {
        return new ReportBottomSheetFragment_MembersInjector(aVar);
    }

    public static void injectSocialRepository(ReportBottomSheetFragment reportBottomSheetFragment, SocialRepository socialRepository) {
        reportBottomSheetFragment.socialRepository = socialRepository;
    }

    public void injectMembers(ReportBottomSheetFragment reportBottomSheetFragment) {
        injectSocialRepository(reportBottomSheetFragment, this.socialRepositoryProvider.get());
    }
}
