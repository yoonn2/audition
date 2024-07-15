function registInout() {
    const form = document.inoutForm;
    const artist_id = form.artist_id.value;
    const artist_name = form.artist_name.value;
    const artist_birth = form.artist_birth.value;
    const artist_gender = form.artist_gender.value;
    const talent = form.talent.value;
    const agency = form.agency.value;

    if(artist_id == "") {
        window.alert("참가번호가 입력되지 않았습니다!");
        form.artist_id.focus();
        return;
    }
    if(artist_name == "") {
            window.alert("참가자명이 입력되지 않았습니다!");
            form.artist_name.focus();
            return;
    }
     if (artist_birth == "") {
            window.alert("생년월일이 입력되지 않았습니다!");
            form.artist_birth.focus();
            return;
    }
    if(artist_gender == "") {
            window.alert("성별이 선택되지 않았습니다!");
            form.artist_gender.focus();
            return;
    }
    if(talent == "") {
            window.alert("특기가 선택되지 않았습니다!");
            form.talent.focus();
            return;
    }
    if(agency == "") {
            window.alert("소속사가 입력되지 않았습니다!");
            form.agency.focus();
            return;
    }
    window.alert("오디션 등록이 정상적으로 등록되었습니다!");
    form.submit();
}
function resetForm(){
    const form = document.inoutForm;
    window.alert("정보를 지우고 처음부터 다시 입력 합니다.");
    form.reset();
    form.artist_id.focus();
}