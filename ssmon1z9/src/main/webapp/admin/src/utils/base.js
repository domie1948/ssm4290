const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmon1z9/",
            name: "ssmon1z9",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmon1z9/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "后勤管理系统"
        } 
    }
}
export default base
