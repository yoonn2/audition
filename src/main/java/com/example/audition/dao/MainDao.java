package com.example.audition.dao;

import com.example.audition.dto.ArtistDto;
import com.example.audition.dto.MentorScoreDto;
import com.example.audition.dto.RankingDto;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.dao.DataAccessException;

import java.util.List;

@Mapper
public interface MainDao {

    @Select("SELECT * FROM tbl_artist_01")
    public List<ArtistDto> getAllArtists() throws DataAccessException;
    @Insert("INSERT INTO tbl_artist_01 VALUES (#{artist_id}, #{artist_name}, #{artist_gender}, #{artist_birth}, #{talent}, #{agency})")
    public void registerArtist(ArtistDto artistDto) throws DataAccessException;
    @Select("SELECT p.serial_no, a.artist_id, a.artist_name, a.artist_birth, p.point, m.mento_name " +
            "FROM tbl_point_01 p " +
            "JOIN tbl_artist_01 a ON p.artist_id = a.artist_id " +
            "JOIN tbl_mento_01 m ON p.mento_id = m.mento_id")
    public List<MentorScoreDto> getMentorScores() throws DataAccessException;
    @Select("SELECT artist_id, artist_name, artist_gender, total_score, average_score, RANK() OVER (ORDER BY average_score DESC) as rank " +
            "FROM (SELECT a.artist_id, a.artist_name, a.artist_gender, SUM(p.point) as total_score, AVG(p.point) as average_score " +
            "FROM tbl_artist_01 a JOIN tbl_point_01 p ON a.artist_id = p.artist_id " +
            "GROUP BY a.artist_id, a.artist_name, a.artist_gender) as scores")
    public List<RankingDto> getRanking();
}
